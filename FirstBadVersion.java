package Top.EASY.Coding_Questions;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
        if(n == 1) return 1;
        
        int low = 1;
        int high = n;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(isBadVersion(mid)){
                //move towards good version
                high = mid -1;
            }else{
                // move towards more recent good versions
                low = mid +1; 
            }
        }
        return low;
    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
