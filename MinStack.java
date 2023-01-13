package Top.MEDIUM.Coding_Questions;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack;
    int min;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(val <= min){
            stack.push(min);
            min = val;
        }
        stack.push(val);        
    }
    
    public void pop() {
        int x = stack.pop();
        if(x == min){
            min = stack.pop();
        }        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;        
    }
}
