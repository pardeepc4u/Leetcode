package com.pk.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    static class TNode{
        int val;
        TNode left, right;
        TNode(int val){
            this.val=val;
            left=right=null;
        }
    }

    TNode root;

    BinarySearchTree(){
        root=null;
    }

    void insert(int k){
        root = insertToBST(root,k);
    }

    TNode insertToBST(TNode root, int k){
        if(root==null){
            root = new TNode(k);
            return root;
        }
        if(k<root.val){
            root.left = insertToBST(root.left,k);
        }else if(k>root.val){
            root.right = insertToBST(root.right,k);
        }
        return root;
    }

    void print(){
        System.out.println("PreOrder BST : ");
        printBSTpreOrder(root);
        System.out.println("\n"+"InOrder BST : ");
        printBSTInOrder(root);
        System.out.println("\n"+"PostOrder BST : ");
        printBSTPostOrder(root);
    }

    void printBSTpreOrder(TNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val + "->");
        printBSTpreOrder(root.left);
        printBSTpreOrder(root.right);
    }

    void printBSTInOrder(TNode root){
        if(root==null){
            return;
        }
        printBSTpreOrder(root.left);
        System.out.print(root.val + "->");
        printBSTpreOrder(root.right);
    }
    void printBSTPostOrder(TNode root){
        if(root==null){
            return;
        }
        printBSTpreOrder(root.left);
        printBSTpreOrder(root.right);
        System.out.print(root.val + "->");
    }




    public static List<List<Integer>> levelOrder(TNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelOrderRec(result, root);
        return result;
    }

    public static void levelOrderRec(List<List<Integer>> result, TNode root) {
        if(root==null)
            return;
        Queue<TNode> que = new LinkedList<>();

        List<Integer> list = new ArrayList<>();
        while(heightofTree(root)>=1){
            que.add(root);
            if(heightofTree(root)==1){
                list.add(root.val);
            }
        }

        result.add(list);
        levelOrderRec(result, root.left);
        levelOrderRec(result, root.right);
//        return result;
    }

    public static int heightofTree(TNode root){
        if(root==null)
            return 0;
        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);
        return Math.max(lh,rh) + 1;
    }

    public void BFS(){
        Queue<Integer> queue = new LinkedList<>();
//        boolean visited[] = new boolean[];
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
//        bst.insert(40);
//        bst.insert(60);
//        bst.insert(70);
//        bst.insert(30);
//        bst.insert(80);
//        bst.insert(90);
//        bst.insert(20);
//        bst.insert(10);
        bst.print();
        System.out.println("Height of Tree : " + heightofTree(bst.root));
        for (List list : levelOrder(bst.root))
            System.out.println(list);
    }

}
