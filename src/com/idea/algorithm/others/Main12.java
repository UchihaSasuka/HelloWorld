package com.idea.algorithm.others;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lipengd@zbj.com on 2017/9/20.
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Node> queue = new LinkedList<>();
        int n = in.nextInt();
        Node root = new Node(n);
        queue.add(root);
        while(!queue.isEmpty()){
            Node parent = queue.poll();
            String s = in.next();
            String[] array1 = s.split(":");
            String[] array2 = array1[1].split("\\|");
            String s1 = array2[0];
            String s2 = array2[1];
            int num1 = Integer.parseInt(s1);
            if(num1 != -1){
                Node leftChild = new Node(num1);
                parent.leftChild = leftChild;
                queue.offer(leftChild);
            }
            int num2 = Integer.parseInt(s2);
            if(num2 != -1){
                Node rightChild = new Node(num2);
                parent.rightChild = rightChild;
                queue.offer(rightChild);
            }

        }
        Stack<Node> stack = new Stack<>();
        printMiddle(root, stack);
        int pre = -1;
        while(!stack.isEmpty()){
            Node node = stack.pop();
            if(pre > node.val){
                System.out.println(0);
                return;
            }
            pre = node.val;
        }
        System.out.println(1);
    }


    public static void printMiddle(Node root, Stack<Node> stack){
        if(root.leftChild != null){
            printMiddle(root.leftChild, stack);
        }
        stack.add(root);
        if(root.rightChild != null) {
            printMiddle(root.rightChild, stack);
        }
    }

}
class Node{
    int val;
    Node leftChild;
    Node rightChild;
    public Node(int val){
        this.val = val;
    }

}