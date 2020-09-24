import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Preorder {

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;
        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.val);
            Collections.reverse(root.children);
            for (Node node : root.children)
                stack.push(node);
        }
        return result;
    }

}
