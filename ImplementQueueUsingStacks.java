package Top.EASY.Coding_Questions;

import java.util.Stack;

public class ImplementQueueUsingStacks {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public ImplementQueueUsingStacks() {
	        
	    }
	    
	    public void push(int x) {
	        s1.push(x);
	    }
	    
	    public int pop() {
	        if(!s2.empty()) {
	        	int t = s2.peek();
	        	s2.pop();
	        	return t;
	        }else {
	        	while(!s1.empty()) {
	        		int t = s1.peek();
	        		s1.pop();
	        		s2.push(t);
	        	}
	        	int t = s2.peek();
	        	s2.pop();
	        	return t;
	        }
	    }
	    
	    public int peek() {
	        if(!s2.empty()) {
	        	int t = s2.peek();
	        	return t;
	        }else {
	        	while(!s1.empty()) {
	        		int t = s1.peek();
	        		s1.pop();
	        		s2.push(t);
	        	}
	        	int t = s2.peek();
	        	return t;
	        }
	    }
	    
	    public boolean empty() {
	        if(s1.empty() && s2.empty()) {
	        	return true;
	        }
	        return false;
	    }
}
