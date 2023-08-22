package com.algo.learn.queue;

public class ReverseLinkedListAlgo {
    public static void main(String[] args) {
        ListNodeInt lastNode = null;
        ListNodeInt listNode = null;
        for (int i = 5; i >= 0; i--) {
            ListNodeInt tmpListNode = new ListNodeInt();
            tmpListNode.value = i;
            tmpListNode.next = lastNode;
            lastNode = tmpListNode;
            if (i == 0) {
                listNode = tmpListNode;
            }
        }
        //遍历
        loopListNode(listNode);
//        ListNode reverse = reverse(listNode);
//        ListNode reverse = reverseLinked(listNode);
        ListNodeInt reverse = reverseLinkedRecursion(listNode);
        System.out.println("----");
        //遍历
        loopListNode(reverse);
    }

    /**
     * 遍历链表
     * @param listNode
     */
    public static void loopListNode(ListNodeInt listNode) {
        if (listNode == null) {
            return;
        }
        System.out.println("listNode->" + listNode);
        if (listNode.next != null) {
            loopListNode(listNode.next);
        }

    }

    static ListNodeInt reverse(ListNodeInt head) {
        if (head.next == null) return head;
        ListNodeInt last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    /**
     * 递归反转
     * @param listNode
     * @return
     */
    public static ListNodeInt reverseLinkedRecursion(ListNodeInt listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNodeInt last = listNode;
        ListNodeInt cur = listNode.next;
        ListNodeInt next = cur.next;

        listNode.next = reverseLinkedRecursion(listNode.next);
        return null;
    }
    /**
     * 循环翻转
     * @param listNode
     * @return
     */
    public static ListNodeInt reverseLinked(ListNodeInt listNode) {
        if (listNode == null) {
            return null;
        }
        if (listNode.next == null) {
            return listNode;
        }

        ListNodeInt last = null;
        ListNodeInt cur = listNode;
        ListNodeInt next = null;

        while (cur != null) {
            System.out.println("last:" + last);
            System.out.println("cur:" + cur);
            System.out.println("next:" + next);
            System.out.println("----");
            next = cur.next;
            cur.next = last;
            last = cur;
            cur = next;
        }
        listNode.next = null;
        return last;

    }
}
