package Top.MEDIUM.Coding_Questions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        function(nums, ds, answer, frequency);
        return answer;
    }
    
    public void function(int[] nums, List<Integer> ds, List<List<Integer>> answer, boolean[] frequency)     {
        if(ds.size() == nums.length){
            answer.add(new ArrayList<>(ds));
            return ;
        }
        
        for(int i = 0; i<nums.length; i++){
            if(!frequency[i]){
                frequency[i] = true;
                ds.add(nums[i]);
                function(nums, ds, answer, frequency);
                ds.remove(ds.size() - 1);
                frequency[i] = false;
            }
        }
    }

}
