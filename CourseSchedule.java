package Top.MEDIUM.Coding_Questions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
	
	Map<Integer, List> adj = new HashMap<>();
    
    public List<Integer> getNeighbour(int n){
        return new ArrayList<>(adj.get(n));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;

        int[] indegree = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++){
            adj.computeIfAbsent(prerequisites[i][1], k -> new ArrayList<>()).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++ ;
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                dq.offer(i);
            }
        }

        int count = 0;

        while(!dq.isEmpty()){
            int current = dq.poll();

            if(indegree[current] == 0) count++;
            if(!adj.containsKey(current)) continue;

            for(int neighbour: getNeighbour(current)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0) {
                    dq.offer(neighbour);
                }
            }

        }
        return numCourses == count;
    }

}