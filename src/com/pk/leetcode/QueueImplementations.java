package com.pk.leetcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementations {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new PriorityQueue<>();

        for(int i=1; i<=5; i++){
            if(i==3){
                queue.remove();
                queue1.remove();
            }
            queue.add(i);
            System.out.println(queue);
            queue1.add(i);
            System.out.println(queue1);
            if(i==5){
                queue.poll();
                queue1.poll();
            }

        }

    }
}
