package Top.EASY.Coding_Questions;

public class LowestCommonAncestor {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null) {
			return null;
		}
		// If both nodes are less than root node then search left subtree
		if(root.data < p.data && root.data < q.data) {
			return lowestCommonAncestor(root.left, p, q);
		}
		
		// If both nodes are greater than the root node, then search right sub-tree
		if(root.data > p.data && root.data > q.data) {
			return lowestCommonAncestor(root.right, p, q);
		}
		
		return root;
	}
}
