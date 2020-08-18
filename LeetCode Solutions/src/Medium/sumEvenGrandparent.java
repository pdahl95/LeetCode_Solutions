package Medium;

public class sumEvenGrandparent {

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

    public static int sumEvenGrandparent(TreeNode root){
        return isEven( root, null, null );
    }
    public static int isEven(TreeNode node, TreeNode parent, TreeNode grandparent){
        int sum = 0;
        if(node == null) return 0;
        if(grandparent != null && grandparent.val % 2 == 0){
            sum += node.val;
        }
        sum += isEven( node.left, node, parent );
        sum += isEven( node.right, node, parent );
        return sum;
    }

    public static void main(String[] args){

    }
}
