package Top.MEDIUM.Coding_Questions;

public class PartitionEqualSubsetSum {
	
	// APPROACH 1: Working but Time limit exceeded	
	public boolean canPartition(int[] nums) {
        if(nums == null || nums.length < 1) return true;

        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        if(sum % 2 == 1) return false;

        sum = sum/2;
        return isSumSubarray(nums, sum, nums.length-1);
    }

    private boolean isSumSubarray(int[] nums, int sum, int last){
        if(sum == 0) return true;

        if(sum < 0 || last < 0) return false;

        return (isSumSubarray(nums, sum, last-1) || isSumSubarray(nums, sum-nums[last], last-1));

    }

}
