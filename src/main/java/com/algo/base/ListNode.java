package com.algo.base;

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

    public int val = -1;
    public ListNode next;

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public void print() {
        StringBuffer sb = new StringBuffer();
        ListNode node = this;
        while (node != null) {
            sb.append(node.val);
            sb.append(",");
            node = node.next;
        }
        System.out.println("printNode Node:" + sb.toString());
    }
}
