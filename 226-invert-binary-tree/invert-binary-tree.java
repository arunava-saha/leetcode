/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void sol(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> h = new LinkedList<>();
        h.add(root);
        while(h.size()>0){
            for(int i = 0; i<h.size(); i++){
                TreeNode temp = h.remove();
                sol(temp);
                if(temp.left != null) h.add(temp.left);
                if(temp.right != null) h.add(temp.right);
            }
        }
        return root;
    }
}