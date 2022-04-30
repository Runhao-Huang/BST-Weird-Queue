public class Test4
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        BinarySearchTree tree = new BinarySearchTree(array);

        tree.preorder_traversal();
        System.out.println();
        tree.postorder_traversal();
        System.out.println();
        tree.inorder_traversal();
    }
}
