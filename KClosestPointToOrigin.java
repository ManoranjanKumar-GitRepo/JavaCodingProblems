package Top.MEDIUM.Coding_Questions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
	
	public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> -a[0]*a[0] - a[1]*a[1]));

        for(int[] p: points){
            pq.offer(p);
            if(pq.size() > k) {
                pq.poll();  // poll out the farthest among the k + 1 points.
            }
        }
        return pq.toArray(new int[k][2]);
    }

}
