package Top.MEDIUM.Coding_Questions;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
        
        int first = 0;
        int end = height.length - 1;
        int answer = 0;
        
        while(first < end) {
            answer = Math.max(answer, Math.min(height[first], height[end]) * (end - first));
            
            if(height[first] < height[end]){
                first = first + 1;
            }else{
                end = end - 1;
            }
        }
        return answer;
    }
}
