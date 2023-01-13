package Top.MEDIUM.Coding_Questions;

public class SortColors {
	
	 public void sortColors(int[] nums) {
	        int n = nums.length;
	        
	        int countRed = 0;
	        int countWhite = 0;
	        int countBlue = 0;
	        
	        for(int i=0; i<n; i++){
	            if(nums[i] == 0) countRed++;
	            else if(nums[i] == 1) countWhite++;
	            else if(nums[i] == 2) countBlue++;
	        }
	        
	        for(int i =0; i<n; i++){
	            if(countRed > 0){
	                nums[i] = 0; // 0 indidates colour Red
	                countRed--;
	            }else if(countWhite > 0){
	                nums[i] = 1;    // 1 indidates colour White
	                countWhite--;
	            }else{
	                nums[i] = 2;    // 2 indidates colour Blue
	            }
	        }
	        return ;
	    }
	    // Time Complexity = O(2*n) where, n is the size of array.
	    // Space Complexity = O(1)

}
