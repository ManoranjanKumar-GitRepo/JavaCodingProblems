package Top.HARD.Coding_Questions;

public class BasicCalculator {

	public int calculate(String s) {
        return helper(0, s, new int[1]);
    }
    
    private int helper(int start, String s, int[] nextPos){
        int pointer = start, cur = 0, val = 0;
        int sign = 1;
        
        while(pointer < s.length()){
            if(s.charAt(pointer) == ' '){
                pointer++;
            }else if(s.charAt(pointer) >= '0' && s.charAt(pointer) <= '9'){
                cur = cur * 10 + (s.charAt(pointer++) - '0');
            }else{
                val = val + sign*cur;
                cur = 0;
                if(s.charAt(pointer) == '+'){
                    sign = 1;
                    pointer++;
                }else if(s.charAt(pointer) == '-'){
                    sign = -1;
                    pointer++;
                }else if(s.charAt(pointer) == '('){
                    val = val + sign * helper(pointer+1, s, nextPos);
                    pointer = nextPos[0];
                }else if(s.charAt(pointer) == ')'){
                    nextPos[0] = pointer + 1;
                    return val;
                }
            }
        }
        val = val + sign * cur;
        return val;
    }
}
