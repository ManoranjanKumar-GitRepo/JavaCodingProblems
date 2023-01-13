package Top.HARD.Coding_Questions;

import java.util.Stack;

public class LargestRectangleInHistogram {
	
	 public int largestRectangleArea(int[] heights) {
	        int arrayLength = heights.length;
	        int i = 0, max = 0;
	        
	        Stack<Integer> stk = new Stack<>();
	        
	        while(i < arrayLength){
	            while(!stk.isEmpty() && heights[i]<heights[stk.peek()]) {
	                max = Math.max(max, heights[stk.pop()] * (i - (stk.isEmpty()? 0 : stk.peek()+1)));   
	            }
	            stk.push(i++);
	        }
	        
	        
	        while(!stk.isEmpty()){
	            max = Math.max(max, heights[stk.pop()] * (arrayLength - (stk.isEmpty() ? 0 : stk.peek()+1)));
	        }
	        
	        return max;
	    }

}
