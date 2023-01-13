package Top.MEDIUM.Coding_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
	
	public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(queue.size() > 0){
            int size = queue.size();

            for(int i=0; i<size; i++){
                TreeNode top = queue.remove();

                // The first element in the queue (right-most of the tree)
                if(i == 0){
                    result.add(top.val);
                }

                // Add right first
                if(top.right != null){
                    queue.add(top.right);
                }

                // Add left
                if(top.left != null){
                    queue.add(top.left);
                }

            }
        }
        return result;
    }

}
