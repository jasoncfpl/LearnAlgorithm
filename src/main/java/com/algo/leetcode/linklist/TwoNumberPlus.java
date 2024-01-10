package com.algo.leetcode.linklist;

import com.algo.leetcode.linklist.model.ListNode;

/**
 *
 * https://leetcode.cn/problems/add-two-numbers/
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class TwoNumberPlus {

    public static void main(String[] args) {

//        //demo1
//        ListNode node1 = Test.createLinkNode1();
//        ListNode node2 = Test.createLinkNode2();

//        //demo2
//        ListNode node1 = new ListNode(0);
//        ListNode node2 = new ListNode(0);

          //demo3
        ListNode node1 = Test.createLinkNode3();
        ListNode node2 = Test.createLinkNode4();

        printNode(node1);
        printNode(node2);

        addTowNumber(node1, node2);

    }

    public static ListNode addTowNumber(ListNode node1,ListNode node2) {
        //是否进位
        int carry = 0;
        ListNode node = null;
        ListNode rootNode = null;
        while (node1 != null || node2 != null) {

            int value1 = node1 != null ? node1.val : 0;
            int value2 = node2 != null ? node2.val : 0;

            int sum = value1 + value2 + carry;

            carry = sum / 10;
            //余数
            int remainder = sum % 10;
            System.out.println("remainder:" + remainder + ",carry:" + carry);
            if (node == null) {
                node = new ListNode(remainder);
                rootNode = node;
            } else {
                node.next = new ListNode(remainder);
                node = node.next;
            }
            if (node1 != null) {
                node1 = node1.next;
            }
            if (node2 != null) {
                node2 = node2.next;
            }
        }
        if (carry != 0) {
            node.next = new ListNode(carry);
        }
        System.out.println("===========");
        printNode(rootNode);
        return rootNode;
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


    static class Test {

        public static ListNode createLinkNode3() {
            ListNode rootNode = new ListNode(9);
            ListNode node1 = new ListNode(9);
            ListNode node2 = new ListNode(9);
            ListNode node3 = new ListNode(9);
            ListNode node4 = new ListNode(9);
            ListNode node5 = new ListNode(9);
            ListNode node6 = new ListNode(9);
            rootNode.addNode(node1);
            rootNode.addNode(node2);
            rootNode.addNode(node3);
            rootNode.addNode(node4);
            rootNode.addNode(node5);
            rootNode.addNode(node6);
            return rootNode;
        }

        public static ListNode createLinkNode4() {
            ListNode rootNode = new ListNode(9);
            ListNode node1 = new ListNode(9);
            ListNode node2 = new ListNode(9);
            ListNode node3 = new ListNode(9);
            rootNode.addNode(node1);
            rootNode.addNode(node2);
            rootNode.addNode(node3);
            return rootNode;
        }

        public static ListNode createLinkNode1() {
            ListNode rootNode = new ListNode(2);
            ListNode node1 = new ListNode(4);
            ListNode node2 = new ListNode(3);
            rootNode.addNode(node1);
            rootNode.addNode(node2);
            return rootNode;
        }

        public static ListNode createLinkNode2() {
            ListNode rootNode = new ListNode(5);
            ListNode node1 = new ListNode(6);
            ListNode node2 = new ListNode(4);
            rootNode.addNode(node1);
            rootNode.addNode(node2);
            return rootNode;
        }

    }
}
