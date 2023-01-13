package Top.EASY.Coding_Questions;

public class AddBinaryStrings {
	
	public String addBinary(String a, String b) {
        
        //If inputs are zero.
        if(a.charAt(0) == '0' && b.charAt(0) == '0'){
            return "0";
        }
        
        // Initialize result string
        StringBuilder resultString = new StringBuilder("");
        
        int sum = 0; // Initialize digital sum
        
        // Traverse both strings starting from last characters
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while(i>=0 || j>=0 || sum ==1){
            
            // Compute sum of last digit and carry
            sum = sum + ((i>=0) ? a.charAt(i)-'0' : 0);
            sum = sum + ((j>=0) ? b.charAt(j)-'0' : 0);
            
            // If current digit sum ia 1 or 3, add 1 to result string
            resultString.append((char)(sum % 2 +'0'));
            
            // Compute carry
            sum = sum/2;
            
            // move to next digits
            i--;
            j--;   
        }
        
        //Remove leading zeros, if any
        int start = resultString.length() - 1;
        
        while(start>=0 && resultString.charAt(start)=='0'){
            start--;
        }
        
        if(start != resultString.length()-1){
            resultString.delete(start+1, resultString.length());
        }
        
        return resultString.reverse().toString();        
    }

}
