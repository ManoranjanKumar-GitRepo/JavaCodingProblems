package Top.EASY.Coding_Questions;

public class BestTimeToBuyAndSellStocks {

	//APPROACH 1: Using nested FOR LOOPS with Time Complexity of O(n^2).
	public int maxProfit(int[] prices) {
	        
	        int maxProfit = 0;
	        
	        for(int i = 0; i < prices.length; i++){
	            for(int j =i+1; j < prices.length; j++){
	            	
	                int profit = prices[j] - prices[i];
	                
	                if(profit > 0 && profit > maxProfit){
	                    maxProfit = profit;
	                    
	                }
	            }
	        }        
	        return maxProfit;
	    }
	
	//APPROACH 2: Time Complexity is O(n)
	public int maxProfitFast(int[] prices) {	
		
			if(prices==null || prices.length <= 1) return 0;
	        
	        int minimum = prices[0]; // minimum so far
	        int maxProfit = 0;

	        for(int i=1; i<prices.length; i++){
	        	
	            maxProfit = Math.max(maxProfit, prices[i]-minimum);
	            
	            minimum = Math.min(minimum, prices[i]);
	        }		
		return maxProfit;
	}
	
	
	
}
