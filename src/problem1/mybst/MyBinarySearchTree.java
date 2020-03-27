package problem1.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree<E> implements MyBinarySearchTreeADT<E> {
    public int numberofleftchild = 0;
    private TreeNode<E> root;
    private int maxlevel = 0;

    public TreeNode<E> getRoot() {
        return root;
    }

    @Override
    public boolean add(E data) {
        return false;
    }

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setLeftchild(addRecursive(currentNode.getLeftchild(), data));
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setRightchild(addRecursive(currentNode.getRightchild(), data));

        }
        return currentNode;
    }

    private void printLeftChild(TreeNode<E> node, int level) {
        if (node == null) {
            return;
        }
        if (maxlevel < level) {
            System.out.println(node.getData() + " ");
        }
        maxlevel = level;
        if (node.getLeftchild() == null) {
            numberofleftchild++;
            maxlevel++;
        }
        printLeftChild(node.getLeftchild(), level + 1);
        printLeftChild(node.getRightchild(), level + 1);
    }

    public void print() {

    }
}
