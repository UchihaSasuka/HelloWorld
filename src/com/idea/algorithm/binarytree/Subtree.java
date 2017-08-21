package com.idea.algorithm.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/16.
 */
public class Subtree {
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2 == null){
            return true;
        }

        if(T1 == null){
            return false;
        }

        if(isEquals(T1, T2)){
            return true;
        }

        return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);

    }

    public boolean isEquals(TreeNode T1, TreeNode T2){

        if(T1 == null || T2 == null){
            return T1 == T2;
        }

        if(T1.val != T2.val){
            return false;
        }
        return isEquals(T1.left, T2.left) && isEquals(T1.right, T2.right);
    }



    //method2 convertToString

    public static boolean isSubtree2(TreeNode T1, TreeNode T2){
        String s1 = binaryTreeToString(T1);
        String s2 = binaryTreeToString(T2);
        if(s2 == null){
            return true;
        }
        if(s1 == null){
            return false;
        }
        return s1.contains(s2);
    }
    public static String binaryTreeToString(TreeNode root){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        StringBuffer sb = new StringBuffer();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            sb.append(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        return sb.toString();
    }





     public class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

}
