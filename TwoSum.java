package Top.EASY.Coding_Questions;

public class TwoSum {
	
	private static int[] result;
	
	// APPROACH 1: Time complexity is O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i < nums.length; i++) {
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result = new int[] {i,j};
                }
                    
            }
        }
    return result;
    }
    
    //APPROACH 2: Time complexity O(n).
    public static int[] twoSum_Faster(int[] nums, int target) {
    	
    	int left = 0;
    	int right = nums.length -1;
    	int sum;
    	
    	while (left < right) {
			sum = nums[left] + nums[right];
			if(sum == target) {
				return new int[] {left, right};
			}
			
			if(sum > target) {
				right--;
			}else {
				left++;
			}
		}
    	
		return new int[] {left,right};
    	
    }

	public static void main(String[] args) {
		
		int target = 9;
		int[] nums = {2,7,11,15};
		
		System.out.print("O(n^2) Time Complexity: ");
		for(int x: twoSum(nums, target)) {
			System.out.print(x +" ");
		}
		
		System.out.println();
		System.out.print("O(n) Time Complexity: ");
		for(int x: twoSum_Faster(nums, target)) {
			System.out.print(x +" ");
		}
		

	}

}
