package Top.MEDIUM.Coding_Questions;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {

	public int[][] insert(int[][] intervals, int[] newInterval) {
        final int n = intervals.length;
        
        List<int[]> answer = new ArrayList<>();
        int i = 0;
        
        while(i < n && intervals[i][1] < newInterval[0]){
            answer.add(intervals[i++]);
        }
        
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            ++i;
        }
        
        answer.add(newInterval);
        
        while(i < n)
            answer.add(intervals[i++]);
        
        return answer.toArray(new int[answer.size()][]);
    }
}
