public class TreeSolution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 101. 对称二叉树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        TreeNode rightNode = new TreeNode(0);
        if (root != null) {
            rightNode = getTranverseTreeNode(root.left);
            boolean result = isok(rightNode, root.right);
            return result;
        } else {
            return true;
        }
    }

    public TreeNode getTranverseTreeNode(TreeNode root) {
        if (root == null)
            return root;

        TreeNode right = getTranverseTreeNode(root.right);
        TreeNode left = getTranverseTreeNode(root.left);
        root.right = left;
        root.left = right;

        return root;
    }


    public Boolean isok(TreeNode t1, TreeNode t2) {
        boolean result = true;
        if (t1 == null && t2 == null)
            return true;
        else if (t1 == null && t2 != null) {

            return false;
        } else if (t1 != null && t2 == null) {

            return false;
        } else {
            if (t1.val == t2.val)
                result = isok(t1.left, t2.left) && isok(t1.right, t2.right);

            else
                result = false;
        }
        return result;
    }
}
