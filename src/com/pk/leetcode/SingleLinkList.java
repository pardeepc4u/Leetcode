package com.pk.leetcode;

public class SingleLinkList {

    Node root;

    static class Node{
        Node next;
        int data;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    static void insert(SingleLinkList r, Node n){
        if(r.root==null){
            r.root=n;
        }else {
            Node t = r.root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
    }

    static void print(SingleLinkList r) {
        if (r.root == null)
            System.out.print("null");
        else {
            Node t = r.root;
            while (t.next != null) {
                System.out.print(t.data + " -> ");
                t = t.next;
            }
        }
    }

        static void printReverse(Node r){
            if (r == null)
                System.out.print("null");
            else {
                if (r.next == null) {
                    System.out.print(r.data + " -> ");
                } else {
                    printReverse(r.next);
                }
            }
            System.out.print(r.data + " -> ");
        }

    public static void main(String [] args){
        SingleLinkList singleLinkList = new SingleLinkList();
        insert(singleLinkList,new Node(1));
        insert(singleLinkList,new Node(2));
        insert(singleLinkList,new Node(3));
        insert(singleLinkList,new Node(4));
        insert(singleLinkList,new Node(5));
        insert(singleLinkList,new Node(6));
        insert(singleLinkList,new Node(7));
        print(singleLinkList);
        printReverse(singleLinkList.root);
    }

}
