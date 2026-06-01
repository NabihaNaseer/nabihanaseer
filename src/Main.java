import java.util.*;

class Node {
    String title;
    HashMap<String, String> data;
    Node left;
    Node right;

    Node(String title) {
        this.title = title;
        this.data = new HashMap<>();
        this.left = null;
        this.right = null;
    }
}
