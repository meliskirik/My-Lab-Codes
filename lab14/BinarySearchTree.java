public class BinarySearchTree {

    public Node root;
    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public void bstFromArray(int[] items){

        this.root = new Node(items[0],null,null );
        for (int i = 1; i < items.length; i++) {
            Node tempNode = root;
            Node newNode = new Node(items[i],null,null );

            while(true) {
                if (items[i] <= tempNode.getItem()) {
                    if (tempNode.getLeftChild() == null) {
                        tempNode.setLeftChild(newNode);
                        break;
                    } else {
                        tempNode = tempNode.getRightChild();
                    }
                } else {
                    if (tempNode.getRightChild() == null) {
                        tempNode.setRightChild(newNode);
                        break;
                    } else {
                        tempNode = tempNode.getRightChild();
                    }
                }
            }
        }
    }
}