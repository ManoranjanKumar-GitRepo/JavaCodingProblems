package Top.HARD.Coding_Questions;

import java.util.PriorityQueue;

public class FindMedianFromDataStream {

	PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    // Constructor
    public FindMedianFromDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        
        if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) * 0.5;
        }
        return maxHeap.peek();
    }
}
