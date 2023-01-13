package Top.HARD.Coding_Questions;

import java.util.Arrays;
import java.util.TreeMap;

public class MaximumProfitInJobScheduling {

	public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        
        // Approach 1: Using Dynamic Programming and TreeMap
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        
        for(int i=0; i<n; i++){
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        
        Arrays.sort(jobs, (a,b)-> a[1]-b[1]);
        
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0,0);
        
        for(int[] arr: jobs){
            int cur = dp.floorEntry(arr[0]).getValue()  + arr[2];
            if(cur > dp.lastEntry().getValue()){
                dp.put(arr[1], cur);
            }  
        }
        return dp.lastEntry().getValue(); 
    }
}
