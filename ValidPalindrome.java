package Top.EASY.Coding_Questions;

public class ValidPalindrome {
	
public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(s.charAt(i));
            }
        }
        
        for(int j=0; j<sb.length(); j++){
            if(sb.charAt(j) != sb.charAt(sb.length()-j-1))
                return false;            
        }
        return true;
    }

}
