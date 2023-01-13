package Top.HARD.Coding_Questions;

public class TrappingRainWater {

	public int trap(int[] height) {
        
        int n = height.length;  // To store the number of blocks
        int num_blocks = 0;     // To store the sum of all the heights
        int max_height = Integer.MIN_VALUE; // To store the maximum height in the array
        
        // Compute the sum of all heights and the maximum height given in an array
        for(int i=0; i<n; i++){
            max_height = Math.max(max_height, height[i]);
            num_blocks += height[i];
        }
        
        // Store the answer and initialize the left and right pointers
        int total = 0;
        int left = 0;
        int right = n-1;
        
        for(int i=1; i<= max_height; i++){
            // Compute the leftmost point greater than current row (i)
            while(height[left] < i){
                left++;
            }
            // Compute the leftmost point greater than current row (i)
            while(height[right] < i){
                right--;
            }
            // Water in this row = right - left + 1
            total += (right - left + 1);
        }
        total = total - num_blocks;
        return total;
    }
}
