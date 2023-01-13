package Top.MEDIUM.Coding_Questions;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
	
	Map<Node,Node> result = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        dfs(node);
        createCopy();
        return result.get(node);
    }

    void createCopy(){
        for(Map.Entry<Node, Node> kk : result.entrySet()){
            Node val = kk.getValue();
            Node key = kk.getKey();

            for(int i = 0; i < key.neighbors.size(); i++){
                val.neighbors.add(result.get(key.neighbors.get(i)));
            }
        }
    }

    void dfs(Node node){
        result.put(node, new Node(node.val));
        for(int i = 0; i < node.neighbors.size(); i++){
            if(!result.containsKey(node.neighbors.get(i))){
                dfs(node.neighbors.get(i));
            }
        }
    }

}
