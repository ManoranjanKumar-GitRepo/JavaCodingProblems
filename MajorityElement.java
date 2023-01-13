package Top.EASY.Coding_Questions;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		
        int count = 0;
        int majorityElement = 0;
        
        for(int val: nums){
        	
            if(count == 0){
                majorityElement = val;
            }
            if(val == majorityElement){
                count = count + 1;
            }else{
                count = count - 1;
            }
        }
        
        return majorityElement;
    }
}
