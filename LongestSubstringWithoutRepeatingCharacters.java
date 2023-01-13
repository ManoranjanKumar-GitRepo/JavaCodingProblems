package Top.MEDIUM.Coding_Questions;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        
        int left = 0; 
        int right = 0;
        
        int res = 0;
        
        while(right < s.length()){
            char r = s.charAt(right);
            chars[r]++;
            
            while(chars[r] > 1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
	
	// Time Complexity : O(N)
	// Space Complexity : O(min(N,M)), as HashSet is used. 
			// N is the length of the string and M is the size of the substrings. 
}
