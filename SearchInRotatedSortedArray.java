package Top.MEDIUM.Coding_Questions;

public class SearchInRotatedSortedArray {
	
	public int search(int[] nums, int target) {
        
        // Approach : Binary Search
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = (low + high) >> 1;
            if(nums[mid] == target) return mid;
            
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] >= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
	// Time Complexity: O(log(N))
	// Space Complexity: O(1)
}
