package com.algo.practise;

import com.algo.base.AlgoTools;
import com.algo.base.ListNode;

/**
 * 约瑟夫问题
 */
public class JosephusProblem {

    public static void main(String[] args) {

        /**
         * n=11, m=3, result=7
         * 结果为 7
         * @return node
         */
        ListNode rootNode = createLoopLink();
        ListNode node = solve(rootNode,3);

        /**
         * n=6, m=5, result=1
         * 结果为 1
         * @return node
         */
//        ListNode rootNode = createLoopLink1();
//        ListNode node = solve2(rootNode,5);
        System.out.println("result:" + node.val);


    }


    public static ListNode solve(ListNode node,int m) {

        int count = 1;

        ListNode lastNode = node;
        ListNode currentNode = node;
        System.out.println("==solve==:" + m);
        while (currentNode != null) {

            System.out.println("==solve==lastNode:" + lastNode.val + ",currentNode:" + currentNode.val + ",count:" + count);
            if (count == m) {
                currentNode = currentNode.next;
                lastNode.next = currentNode;
                count = 1;
            } else {
                count++;
                lastNode = currentNode;
                currentNode = currentNode.next;
            }

            if (currentNode.val == currentNode.next.val) {
                break;
            }

        }

        return currentNode;

    }



    /**
     * n=11, m=3, result=7
     * 结果为 7
     * @return node
     */
    public static ListNode createLoopLink() {
        ListNode rootNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        ListNode node11 = new ListNode(11);
        rootNode.addNode(node2);
        rootNode.addNode(node3);
        rootNode.addNode(node4);
        rootNode.addNode(node5);
        rootNode.addNode(node6);
        rootNode.addNode(node7);
        rootNode.addNode(node8);
        rootNode.addNode(node9);
        rootNode.addNode(node10);
        rootNode.addNode(node11);

        node11.addNode(rootNode);

        return rootNode;
    }

    /**
     * n=6, m=5, result=1
     * 结果为 1
     * @return node
     */
    public static ListNode createLoopLink1() {
        ListNode rootNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        rootNode.addNode(node2);
        rootNode.addNode(node3);
        rootNode.addNode(node4);
        rootNode.addNode(node5);
        rootNode.addNode(node6);


        node6.addNode(rootNode);

        return rootNode;
    }



}
