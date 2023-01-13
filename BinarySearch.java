package Top.EASY.Coding_Questions;

import java.util.Arrays;

public class BinarySearch {

	public int search(int[] nums, int target) {
        
		   // return the index position of target, if it is present and Index position will be >= 0.
	       int index = Arrays.binarySearch(nums, target);	
			
			if(index >= 0) {
				return index;
			}else {
				return -1;
			} 
	        
	    }
}
