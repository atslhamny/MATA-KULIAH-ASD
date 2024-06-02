package PRAKTIKUM1;
/**
 * BinaryTreeMain04
 */
public class BinaryTreeMain04 {
    public static void main(String[] args) {
        BinaryTree04 bt = new BinaryTree04();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.add(30);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node : " + bt.find(5));

        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        bt.addNodeR(30);
        System.out.println("");

        System.out.print("Data Terbesar: ");
        bt.maksimal();
        System.out.println("Data Terkecil: ");
        bt.minimal();

        System.out.println("data yang ada di leaf : ");
        bt.printLeft(bt.root);
        System.out.println();
        System.out.println("Data Leaf Berjumlah : " + bt.jumlahLeft());


    }
}