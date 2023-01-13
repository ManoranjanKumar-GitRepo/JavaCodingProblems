package Top.MEDIUM.Coding_Questions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	
	// APPROACH 1: Using Dynamic Programming
	public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && wordDictSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }   // Time Complexity = O(n^2)

    return dp[s.length()];
    }
}
