package Top.EASY.Coding_Questions;

public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
        
        StringBuilder sbMagazine = new StringBuilder(magazine);
        StringBuilder sbRansom = new StringBuilder(ransomNote);
        
        for(int i=0; i<ransomNote.length(); i++){
            if(sbMagazine.indexOf(ransomNote.substring(i,i+1)) != -1){
            	
                sbMagazine.deleteCharAt(sbMagazine.indexOf(ransomNote.substring(i,i+1)));
                sbRansom.deleteCharAt(sbRansom.indexOf(ransomNote.substring(i,i+1)));
            }
        }
        return sbRansom.length() == 0;
    }
}
