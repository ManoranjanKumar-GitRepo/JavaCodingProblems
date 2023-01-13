package Top.EASY.Coding_Questions;

public class ClimbingStairs {

	int[] arr = new int[100];
    
    public int climbStairs(int n) {
    	
    	// Approach 1 - Using Memoization () of Dynamic Programming
		/*
		 * Memoization is an optimization process. In simple terms, we store the
		 * intermediate results of the solutions of sub-problems, allowing us to speed
		 * up the computation of the overall solution.
		 */
        
        if(n<0) return 0;
        if(n==0) return 1;
        
        int val = arr[n];
        
        if(val != 0) return val;
        
        val = climbStairs(n-1) + climbStairs(n-2);
        arr[n] = val; 							// example of memoization.
        
        return val;
    }
}
