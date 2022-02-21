/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> hs = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        if(hs.containsKey(node)) return hs.get(node);
        Node x = new Node(node.val,new ArrayList<Node>());
        hs.put(node,x);
        for(Node i: node.neighbors){
            x.neighbors.add(cloneGraph(i));
        }
        return hs.get(node);
    }
}