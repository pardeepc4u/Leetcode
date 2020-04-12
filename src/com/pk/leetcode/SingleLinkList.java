package com.pk.leetcode;

public class SingleLinkList {

     Node root;

     class Node{
        Node next;
        int data;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    public SingleLinkList(){
        root=null;
    }

     Node insert(int n){
        if(root==null){
            return root=new Node(n);
        }else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = new Node(n);
            root = t;
        }
        return root;
    }

     void print() {
        if (root == null)
            System.out.print("null");
        else {
            Node t = root;
            while (t.next != null) {
                System.out.print(t.data + " -> ");
                t = t.next;
            }
        }
    }

    void printReverse(Node r){
        if (r == null)
            System.out.print( "null" );
        else {
            if (r.next == null) {
                System.out.print( r.data + " -> " );
            } else {
                printReverse( r.next );
            }
        }
        }

    public static void main(String [] args){
        SingleLinkList singleLinkList = new SingleLinkList();
//        singleLinkList.insert(1);
//        singleLinkList.insert(2);
//        singleLinkList.insert(3);
//        singleLinkList.insert(4);
//        root=insert(5);
//        root=insert(6);
//        root=insert(7);
//        singleLinkList.root=new Node( 1 );

        System.out.println("Single Linklist : ");
        singleLinkList.print();
        System.out.println("\n"+"Recursive - Single Linklist : ");
        singleLinkList.printReverse(singleLinkList.root);
        swapPairs(singleLinkList.root);
        singleLinkList.print();
    }

    public static void swapPairs(Node head) {
        if(head==null || head.next==null || head.next.next==null){
            return;
        }
        Node temp=head.next;
        head.next=head.next.next;
        head.next.next=temp;
        swapPairs(head.next.next);
//        return head;
    }
}
