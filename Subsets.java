package Top.MEDIUM.Coding_Questions;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        rec(result, new ArrayList<>(), nums, 0, used);
        
        return result;
    }
    
    private void rec(List<List<Integer>> result, List<Integer> temp, int[] nums, int index, boolean[] used){
        result.add(new ArrayList<>(temp));
        if(temp.size() == nums.length){
            return;
        }
        
        for(int i = index; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            temp.add(nums[i]);
            used[i] = true;
            rec(result, temp, nums, i, used);
            used[i] = false;
            temp.remove(temp.size() - 1);      
        }
        
    }

}
