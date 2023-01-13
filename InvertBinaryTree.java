package Top.EASY.Coding_Questions;

public class InvertBinaryTree {
	
	// Time Complexity = O(n), where 'n' is the number of nodes.
	// Space Complexity = O(h), where 'h' is the height of the Binary Tree.
	
	public TreeNode invertTree(TreeNode root) {
		
		TreeNode temp;
		
		// If root is NULL then inverted binary tree is also NULL.
		if(root == null) return null;
		
		// Swapping the children
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		// Recursion
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
    }
}
