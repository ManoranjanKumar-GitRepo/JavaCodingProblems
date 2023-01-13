package Top.HARD.Coding_Questions;

public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
        
        int[] intArray = new int[256];
        char[] charArray_S = s.toCharArray();
        char[] charArray_T = t.toCharArray();
        
        for(char ch: charArray_T) 
            intArray[ch]++;
        
        int tLength = t.length();
        int count = 0;
        int start = 0; 
        int len = s.length()+1;
        
        for(int right=0, left=0; right < s.length(); right++){
            if(intArray[charArray_S[right]]-- > 0 ){
                count++;
            }
            
            while(left < right && intArray[charArray_S[left]] < 0){
                if(++intArray[charArray_S[left++]] > 0) count--;
            }
            
            if(count == tLength && right-left+1 < len){
                start = left;
                len = right - left +1;
            }
        }
        
        return len == s.length()+1 ? "" : s.substring(start, start+len);
    }
}
