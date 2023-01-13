package Top.EASY.Coding_Questions;

public class LongestPalindrome {
	
	 public int longestPalindrome(String str) {
	        
	        if(str==null || str.length()==0) return 0;
	        
	        if(str.length() == 1) return 1;
	        
	        int max_length = 0;
	        int[] arr = new int[128];
	        
	        for(char ch: str.toCharArray()){
	        	
	            arr[ch]++;
	            if(arr[ch] == 2){
	                max_length += 2;
	                arr[ch] = 0;
	            }
	        }
	        
	        if(str.length() > max_length) return max_length+1;
	        else return max_length;
	    }
}
