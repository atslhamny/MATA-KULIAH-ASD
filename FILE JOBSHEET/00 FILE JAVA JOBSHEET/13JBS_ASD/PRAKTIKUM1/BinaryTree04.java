package PRAKTIKUM1;

public class BinaryTree04 {
    Node04 root;

    public BinaryTree04() {
        root = null;
    }

    boolean isEmpty(){
        return root != null;
    }

    void add(int data){
        if (!isEmpty()) {
            root = new Node04(data);
        }else{
            Node04 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node04(data);
                        break;
                    }else{
                        current = current.left;
                    }
                }else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node04(data);
                        break;
                    }else{
                        current = current.right;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        Node04 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            }else if (data < current.data) {
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node04 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node04 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node04 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node04 getSuccessorNode04(Node04 del){
        Node04 successor = del.right;
        Node04 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree Is Empty");
            return;
        }
        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data==data) {
                break;
            }else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else{
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
            if (current.left==null && current.right==null) {
                if (current==root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left==null) {
                if (current==root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if (current.right == null) {
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node04 successor = getSuccessorNode04(current);
                if (current==root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        if (isLeftChild) {
                            parent.left = successor;
                        }else{
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
    }

    //No 1
    void addNodeR(int key) {
        root = addNodeR(root, key);
    }

    public Node04 addNodeR(Node04 current, int data) {
        if (current == null) {
            return new Node04(data);
        }
        if (data < current.data) {
            current.left = addNodeR(current.left, data);
        } else if (data > current.data) {
            current.right = addNodeR(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    //No 2
    void maksimal() {
        Node04 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println(current.data);
    }

    void minimal() {
        Node04 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.data);
    }

    //No 3
    void printLeft(Node04 root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(" " + root.data);
            return;
        }
        if (root.left != null) {
            printLeft(root.left);
        }
        if (root.right != null) {
            printLeft(root.right);
        }
    }

    //No 4
    int jumlahLeft() {
        return jumlahLeft(root);
    }

    int jumlahLeft(Node04 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return jumlahLeft(node.left) + jumlahLeft(node.right);
        }
    }
}
