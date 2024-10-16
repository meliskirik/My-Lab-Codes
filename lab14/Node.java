public class Node {

    private int item;
    private Node leftChild;
    private Node rightChild;

    public Node(int item, Node leftChild, Node rightChild) {
        this.item = item;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
