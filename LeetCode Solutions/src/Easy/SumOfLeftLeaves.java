package Easy;

public class SumOfLeftLeaves {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int sumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;
        return subtree( root, false );
    }

    public static int subtree(TreeNode node, boolean isLeft){
        if(node.left == null && node.right == null){
            return isLeft ? node.val : 0;
        }
        int sum = 0;
        if(node.left != null){
            sum += subtree( node.left, true );
        }
        if(node.right != null){
            sum += subtree( node.right, false );
        }
        return sum;
    }

    public static void main(String[] args){
//        sumOfLeftLeaves();
    }
}
