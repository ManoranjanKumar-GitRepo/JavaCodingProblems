package Top.EASY.Coding_Questions;

/* Definition for singly-linked list.
public class ListNode {
	
		int data;
	    ListNode next;
	    
	    ListNode() {}
	    
	    ListNode(int data) { 
	   	 	this.data = data; 
	   	 }
	    
	    ListNode(int data, ListNode next) { 
	   	 	this.data = data; 
	   	 	this.next = next; 
	   	 }
}
*/
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		// Check if both the lists are NULL then return NULL
			if(list1 == null && list2 == null) return null;
	        
		// Check if any of the two lists are NULL then return the other list.
	        if(list1 == null) return list2;
	        if(list2 == null) return list1;
	        
	   // Approach: Using Recursion
	        if(list1.data < list2.data){
	            list1.next = mergeTwoLists(list1.next, list2);
	            return list1;
	        }else{
	            list2.next = mergeTwoLists(list1, list2.next);
	            return list2;
	        }
	}

}
