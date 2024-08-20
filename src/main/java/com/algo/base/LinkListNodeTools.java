package com.algo.base;

public class LinkListNodeTools {

    /**
     * 创建链表 1
     * @return list node
     */
    public static ListNode createLinkNode1() {
        return new ListNode(1);
    }

    /**
     * 创建链表 1->2
     * @return list node
     */
    public static ListNode createLinkNode2() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        rootNode.addNode(node1);
        return rootNode;
    }

    /**
     * 创建链表 1->2->3
     * @return list node
     */
    public static ListNode createLinkNode3() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        rootNode.addNode(node1);
        rootNode.addNode(node2);
        return rootNode;
    }

    /**
     * 创建链表 1->2->3->4
     * @return list node
     */
    public static ListNode createLinkNode4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.addNode(node2);
        node1.addNode(node3);
        node1.addNode(node4);
        return node1;
    }

    /**
     * 创建链表 1->2->3->4->5
     * @return list node
     */
    public static ListNode createLinkNode5() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        rootNode.addNode(node1);
        rootNode.addNode(node2);
        rootNode.addNode(node3);
        rootNode.addNode(node4);
        return rootNode;
    }

    /**
     * 创建循环链表 1->2->3->4->5
     * @return list node
     */
    public static ListNode createLoopLinkNode5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node5.addNode(node1);
        node1.addNode(node2);
        node1.addNode(node3);
        node1.addNode(node4);
        node1.addNode(node5);

        return node1;
    }

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
