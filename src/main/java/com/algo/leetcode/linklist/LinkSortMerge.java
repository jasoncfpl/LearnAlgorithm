package com.algo.leetcode.linklist;

import com.algo.leetcode.linklist.model.ListNode;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例 1：
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 *
 * 提示：
 *
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 *
 */
public class LinkSortMerge {

    public static void main(String[] args) {
        ListNode node1 = createLinkNode1();
        node1.print();
        ListNode node2 = createLinkNode2();
        node2.print();
        ListNode result = solution(node1,node2);
        result.print();
    }


    public static ListNode solution(ListNode node1,ListNode node2) {

        ListNode pre = null;
        ListNode listNode = null;

        while (node1 != null || node2 != null) {

            int value = -1;
            ListNode tmp = null;
            System.out.println("node1:" + node1);
            System.out.println("node2:" + node2);
            if (node1 != null && node2 != null) {
                if (node1.val <= node2.val) {
                    value = node1.val;
                    node1 = node1.next;
                } else {
                    value = node2.val;
                    node2 = node2.next;
                }
            } else if (node1 != null && node2 == null) {
                value = node1.val;
                node1 = node1.next;
            } else if (node1 == null && node2 != null) {
                value = node2.val;
                node2 = node2.next;
            }
            tmp = new ListNode(value);
            System.out.println("tmp:" + value);
            if (listNode == null) {
                listNode = tmp;
                pre = listNode;
            } else {
                listNode.next = tmp;
                listNode = tmp;
            }
            System.out.println("after node1:" + node1);
            System.out.println("after node2:" + node2);
        }


        return pre;
    }


    public static ListNode createLinkNode1() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        rootNode.addNode(node1);
        rootNode.addNode(node3);
        return rootNode;
    }

    public static ListNode createLinkNode2() {
        ListNode rootNode = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        rootNode.addNode(node1);
        rootNode.addNode(node2);
        return rootNode;
    }

}
