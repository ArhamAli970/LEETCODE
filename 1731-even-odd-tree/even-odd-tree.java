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
    public boolean isEvenOddTree(TreeNode root) {

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int level=0;

    while(!q.isEmpty()){
        int size=q.size();
        int prev=level%2!=0?Integer.MAX_VALUE:Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            TreeNode curr=q.remove();
            if(level%2==0){
                if(curr.val%2==0 || curr.val<=prev){return false;}
                prev=curr.val;
            }else{
                if(curr.val%2!=0 || curr.val>=prev){return false;}
                prev=curr.val;
            }

if(curr.left!=null){q.add(curr.left);}
if(curr.right!=null){q.add(curr.right);}


        }

        level++;
    }


    return true;
        
    }
}