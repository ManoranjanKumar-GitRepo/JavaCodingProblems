package Top.MEDIUM.Coding_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	private Set<String> ops = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

    public int evalRPN(String[] tokens) {
        Stack<Integer> stck = new Stack<>();
        for(String str: tokens) {
            if(!ops.contains(str)){
                stck.push(Integer.parseInt(str));
            }else{
                int b = stck.pop();
                int a = stck.pop();
                if(str.equals("+")){
                    stck.push(a + b);
                }else if(str.equals("-")){
                    stck.push(a - b);
                }else if(str.equals("*")){
                    stck.push(a * b);
                }else {
                    stck.push(a/b);
                }
            }

        }
        return stck.pop();        
    }

}
