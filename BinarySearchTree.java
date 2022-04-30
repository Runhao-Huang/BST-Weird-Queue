public class BinarySearchTree
{
    private TreeNode root;

    private class TreeNode
    {
        private int value;
        private TreeNode left;
        private TreeNode right;

        //The default constructor of this class.
        public TreeNode()
        {
            value = 0;
            left = null;
            right = null;
        }

        //The constructor of treeNode with an integer which is assign to the node value.
        public TreeNode(int data) {
            value = data;
            left = null;
            right = null;
        }

    }

    //The default constructor of this class.
    public BinarySearchTree()
    {
        this.root = null;
    }

    //The constructor of BinarySearchTree with an integer array, which is used to run and test the code.
    public BinarySearchTree(int[] array)
    {
        this.root = ArrayToTree(array, 0, array.length - 1);
    }


    //This method is a recursive method that turn a sorted array into a BinarySearchTree.
    //There is no error condition.
    public TreeNode ArrayToTree(int array[], int low, int high)
    {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode currNode = new TreeNode(array[mid]);
        currNode.left = ArrayToTree(array, low, mid - 1);
        currNode.right = ArrayToTree(array, mid + 1, high);

        return currNode;

    }

    //This method is recursive and print the element in the tree in preorder.
    //There is no error condition.
    private void preorder_helper(TreeNode curr)
    {
        if (curr == null) {
            return;
        }
        System.out.print(curr.value  + " ");
        preorder_helper(curr.left);
        preorder_helper(curr.right);
    }

    //This method is used to call the preorder_helper method to start printing.
    //There is no error condition.
    public void preorder_traversal()
    {
        preorder_helper(root);
    }

    //This method is recursive and print the element in the tree in postorder.
    //There is no error condition.
    private void postorder_helper(TreeNode curr)
    {
        if (curr == null) {
            return;
        }
        postorder_helper(curr.left);
        postorder_helper(curr.right);
        System.out.print(curr.value  + " ");
    }

    //This method is used to call the postorder_helper method to start printing.
    //There is no error condition.
    public void postorder_traversal()
    {
        postorder_helper(root);
    }

    //This method is recursive and print the element in the tree in inorder.
    //There is no error condition.
    private void inorder_helper(TreeNode curr)
    {
        if (curr == null) {
            return;
        }
        inorder_helper(curr.left);
        System.out.print(curr.value  + " ");
        inorder_helper(curr.right);
    }

    //This method is used to call the inorder_helper method to start printing.
    //There is no error condition.
    public void inorder_traversal()
    {
        inorder_helper(root);
    }
}
