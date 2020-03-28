package problem2.main;

public class MyTraverse {
       TreeNode root;

    public TreeNode getRoot() {
        return root;
    }
    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (data <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    void traversePreorder(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData() + " ");
            traversePreorder(node.getLeft());
            traversePreorder(node.getRight());
        }
    }

    void traversePostorder(TreeNode node) {
        if (node != null) {
            traversePostorder(node.getLeft());
            traversePostorder(node.getRight());
            System.out.println(node.getData() + " ");
        }
    }
}
