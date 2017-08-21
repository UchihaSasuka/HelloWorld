package com.idea.algorithm.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/16.
 */
public class BinaryTree {

    public static void main(String[] args) {
        System.out.println(serialize(creatBinaryTree("1,2,3,#,#,4")));
        System.out.println(serialize(creatBinaryTree("3,4")));
    }
    public static String serialize(TreeNode root) {
        // write your code here
        if(root == null){
            return "{}";
        }

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        for(int i = 0 ; i < queue.size() ; i++){
            TreeNode node = queue.get(i);
            if(node != null){
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }
        StringBuffer sb = new StringBuffer("");
        for(int i = 0 ; i < queue.size() ; i++){
            TreeNode node = queue.get(i);
            if(node != null){
                sb.append(node.val+"");
            }else {
                sb.append("#");
            }
        }
        sb.replace(sb.length(), sb.length(), "");
        return sb.toString();
    }

    public static TreeNode creatBinaryTree(String string){
        Queue<TreeNode> queue = new LinkedList<>();
        String[] array = string.split(",");
        if(array.length <= 0 ){
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(array[0]));
        queue.offer(root);

        for(int i = 1 ; i < array.length ; i++){
            TreeNode node =queue.poll();
            if(!array[i].equals("#")){
                int num = Integer.parseInt(array[i]);
                node.left = new TreeNode(num);
                queue.offer(node.left);
            }
            i++;
            if(i < array.length && !array[i].equals("#")){
                int num = Integer.parseInt(array[i]);
                node.right = new TreeNode(num);
                queue.offer(node.right);
            }

        }
        return root;
    }

    static class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }
}
