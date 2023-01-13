package Top.MEDIUM.Coding_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination_PhoneNumber {
	
	Map<Character, char[]> map = new HashMap<>();
    
    // Declare Constructor
    public LetterCombination_PhoneNumber(){
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

	public List<String> letterCombinations(String digits) {
	    
	    List<String> answer = new ArrayList<String>();
	    
	    if(digits == null || digits.length() == 0) return answer;
	    StringBuffer sb = new StringBuffer();
	    recursion(digits, 0, sb, answer);
	    return answer;
	}

	private void recursion(String digits, int i, StringBuffer sb, List<String> answer){
	    if(i == digits. length()){
	        answer.add(sb.toString());
	        return;
	    }
	    
	    for(char c : map.get(digits.charAt(i))){
	        sb.append(c);
	        recursion(digits, i+1, sb, answer);
	        sb.delete(i, i+1);
	    }
	}
	
}
