package Top.MEDIUM.Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

	public int[][] merge(int[][] intervals) {
        if(intervals.length == 1 || intervals.length == 0){
            return intervals;
        }
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });
        int start = 0;
        int end = 1;
        
        while(end < intervals.length){
            if(intervals[start][1] >= intervals[end][0]){
                if(intervals[end][1] > intervals[start][1])
                    intervals[start][1] = intervals[end][1];
            } else{
                start++;
                if(start != end){
                    intervals[start][0] = intervals[end][0];
                    intervals[start][1] = intervals[end][1];
                }
            }
            end++;
        }
        int[][] result = new int[start+1][2];
        for(int i =0; i <= start; i++){
            result[i] = intervals[i];
        }
        return result;
    }
}
