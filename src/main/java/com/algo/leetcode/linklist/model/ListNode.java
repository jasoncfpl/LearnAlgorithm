package com.algo.leetcode.linklist.model;

/**
 * 链表节点
 */
public class ListNode {

    public ListNode(int value) {
        this.val = value;
    }

    public void addNode(ListNode node) {
        if (this.next == null) {
            this.next = node;
        } else {
            this.next.addNode(node);
        }
    }

    public int val;
    public ListNode next;
}
