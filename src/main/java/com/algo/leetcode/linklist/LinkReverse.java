package com.algo.leetcode.linklist;


import com.algo.base.ListNode;

/**
 *
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *
 *
 * 提示：
 *
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *
 *
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 */
public class LinkReverse {

    public static void main(String[] args) {
        ListNode rootNode1 = createLinkNode1();
        ListNode rootNode2 = createLinkNode2();
        ListNode rootNode3 = null;
        System.out.println("---rootNode1---");
        printNode(rootNode1);
        rootNode1 = reverseList(rootNode1);
        System.out.println("---rootNode1 after---");
        printNode(rootNode1);
        System.out.println("---rootNode2---");
        printNode(rootNode2);
        rootNode2 = reverseList(rootNode2);
        System.out.println("---rootNode2 after---");
        printNode(rootNode2);
        System.out.println("---rootNode3---");
        printNode(rootNode3);
        rootNode3 = reverseList(rootNode3);
        System.out.println("---rootNode3 after---");
        printNode(rootNode3);
    }


    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode currentNode = head;

        while (currentNode != null) {

            ListNode next = currentNode.next;
            currentNode.next = pre;
            pre = currentNode;
            currentNode = next;

        }

        return pre;

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
    public static ListNode createLinkNode1() {
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

    public static ListNode createLinkNode2() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        rootNode.addNode(node1);
        return rootNode;
    }

}
