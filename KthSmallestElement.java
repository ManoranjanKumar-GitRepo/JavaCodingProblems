package Top.MEDIUM.Coding_Questions;

import java.util.LinkedList;

/*APPROACH 1: 
 * -> The binary tree consists of elements in sorted order.
   -> The easiest way of finding the solution is to insert the elements in the priority queue and then pop out k-1 elements, 
      then the top element of the priority queue is the kth smallest element of the tree.
   -> The optimized solution is doing in-order traversal and keeping track of the count of the number of elements visited.
   -> After visiting the leftmost element of the binary tree, increase the count to 1 and traverse back in an in-order manner and increase the count.
   -> Whenever the count is reached to k return that element.
*/

public class KthSmallestElement {

	public int kthSmallest(TreeNode root, int k) {
        
        //Stack to store the node pointers
        LinkedList<TreeNode> stack = new LinkedList<>();
        
        while(true){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            
            // Traversing the left most of a node and inserting the element into the stack.
            root = stack.pop();
            k--;
            // If it is Kth smallest element then return it.
            if(k==0){
                return root.val;
            }
            // move to the next largest node which is at the right in BST.
            root = root.right;
        }     
    }


	
	
}
