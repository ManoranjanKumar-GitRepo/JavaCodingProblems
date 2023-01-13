package Top.MEDIUM.Coding_Questions;

public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        for(int i = 0; i <= amount; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        for(int i = 0; i <= amount; i++){
            for(int e: coins){
                if(i - e >= 0 && dp[i-e] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-e]+1);
            }
        }

        if(dp[amount] == Integer.MAX_VALUE) return -1;
        else return dp[amount];
    }

}
