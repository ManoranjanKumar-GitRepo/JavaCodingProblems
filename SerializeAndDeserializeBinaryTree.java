package Top.HARD.Coding_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SerializeAndDeserializeBinaryTree {
	
	 	int t;

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        if(root == null) return null;
	        
	        Stack<TreeNode> stk = new Stack<>();
	        stk.push(root);
	        
	        List<String> lst = new ArrayList<>();
	        
	        while(!stk.isEmpty()){
	            TreeNode tn = stk.pop();
	            // If current node is null, store marker.
	            if(tn == null){
	               lst.add("#"); 
	            }else{
	                // Else store current node and recur for its children
	                lst.add("" + tn.data);
	                stk.push(tn.right);
	                stk.push(tn.left);
	            }
	        }
	        return String.join(",", lst);
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        if(data == null) return null;
	        
	        t = 0;
	        
	        String[] strArr = data.split(",");
	        return helper(strArr);
	    }
	    
	    public TreeNode helper(String[] strArr){
	        if(strArr[t].equals("#")) return null;
	        
	        TreeNode root = new TreeNode(Integer.parseInt(strArr[t]));
	        t++;
	        root.left = helper(strArr);
	        t++;
	        root.right = helper(strArr);
	        
	        return root;
	    }

}
