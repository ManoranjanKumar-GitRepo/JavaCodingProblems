package Top.EASY.Coding_Questions;

public class BalancedBinaryTree {

		public boolean isBalanced(TreeNode root) {
	        
	        int leftSubTreeHeight;
	        int rightSubTreeHeight;
	        
	        if(root == null) return true;
	        
	        leftSubTreeHeight = height(root.left);
	        rightSubTreeHeight = height(root.right);
	        
	        if(Math.abs(leftSubTreeHeight - rightSubTreeHeight) <= 1 && 
	           isBalanced(root.left) && isBalanced(root.right)) 
	            return true;
	        
	        return false;
	    }
	    
	    int height(TreeNode node) {
	        if(node == null) return 0;
	        
	        return 1 + Math.max(height(node.left), height(node.right));
	    }
}
