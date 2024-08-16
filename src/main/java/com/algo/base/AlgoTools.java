package com.algo.base;

public class AlgoTools {
    public static void printNode(ListNode node) {
        StringBuffer sb = new StringBuffer();
        while (node != null) {
            sb.append(node.val);
            sb.append(",");
            node = node.next;
        }
        System.out.println("printNode Node:" + sb.toString());
    }
}
