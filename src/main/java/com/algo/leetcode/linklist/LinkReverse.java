package com.algo.leetcode.linklist;


import com.algo.base.LinkListNodeTools;
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
        ListNode rootNode1 = LinkListNodeTools.createLinkNode5();
        ListNode rootNode2 = LinkListNodeTools.createLinkNode2();
        ListNode rootNode3 = null;
        System.out.println("---rootNode1---");
        LinkListNodeTools.printNode(rootNode1);
        rootNode1 = reverse(rootNode1);
        System.out.println("---rootNode1 after---");
        LinkListNodeTools.printNode(rootNode1);
        System.out.println("---rootNode2---");
        LinkListNodeTools.printNode(rootNode2);
        rootNode2 = reverse(rootNode2);
        System.out.println("---rootNode2 after---");
        LinkListNodeTools.printNode(rootNode2);
        System.out.println("---rootNode3---");
        LinkListNodeTools.printNode(rootNode3);
        rootNode3 = reverse(rootNode3);
        System.out.println("---rootNode3 after---");
        LinkListNodeTools.printNode(rootNode3);
    }


    public static ListNode reverse(ListNode head) {
//        return reverseList(head);
        return reverseList2(head);
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

    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }




}
