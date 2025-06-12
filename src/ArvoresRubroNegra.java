public class ArvoresRubroNegra {
enum Color{
    RED,BLACK
}

class Node {
    int key;
    Color color;
    Node left, right, parent;

    Node(int key) {
        this.key = key;
        this.color = Color.RED;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
public class RedBlackTree {
    private Node root;
    private final Node NIL;

    public RedBlackTree() {
        NIL = new Node(-1);
        NIL.color = Color.BLACK;
        NIL.left = NIL.right = NIL.parent = null;
        root = NIL;
    }

    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != NIL) y.left.parent = x;

        y.parent = x.parent;

        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.left = x;
        x.parent = y;
    }
    private void rightRotate(Node y){
        Node x = y.right;
        y.right = x.left;
        if (x.left != NIL) x.left.parent = y;

        x.parent = y.parent;

        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;

        x.left = y;
        y.parent = x;
    }
    public void insert(int key){
        Node node = new Node(key);
        node.left = node.right = node.parent = NIL;

        Node y = null;
        Node  x = root;

        while (x != NIL){
            y = x;
            if (node.key < x.key) x = x.left;
            else x = x.right;
        }
        node.parent = y;
        if(y == null) root = node;
        else if (node.key < y.key) y.left = node;
        else y.right = node;

        node.left = NIL;
        node.right = NIL;
        node.color = Color.RED;

        insertFix(node);
    }
    private void insertFix (Node k) {
        while (k.parent != null && k.parent.color == Color.RED){
            if (k.parent == k.parent.parent.left){
                Node u = k.parent.parent.right;
                if (u.color == Color.RED) {
                    k.parent.color = Color.BLACK;
                    u.color = Color.BLACK;
                    k.parent.parent.color = Color.RED;
                    k = k.parent.parent;
                }else{
                    if (k == k.parent.right) {
                        k = k.parent;
                        leftRotate(k);
                    }
                    k.parent.color = Color.BLACK;
                    k.parent.parent.color = Color.RED;
                    rightRotate(k.parent.parent);
                }
            }
        }
    }
}
}
