package com.algo.leetcode.linklist;


import com.algo.base.LinkListNodeTools;
import com.algo.base.ListNode;

/***
 * 链表中环的检测
 * 快慢指针
 */
public class LinkRing {

    public static void main(String[] args) {

        ListNode rootNode0 = null;
        ListNode rootNode1 = LinkListNodeTools.createLinkNode1();
        ListNode rootNode5 = LinkListNodeTools.createLinkNode5();
        ListNode loopLinkNode5 = LinkListNodeTools.createLoopLinkNode5();

        boolean isRing0 = isRing(rootNode0);
        System.out.println("rootNode0 isRing:" + isRing0);
        boolean isRing1 = isRing(rootNode1);
        System.out.println("rootNode1 isRing:" + isRing1);
        boolean isRing5 = isRing(rootNode5);
        System.out.println("rootNode5 isRing:" + isRing5);
        boolean isLoopRing5 = isRing(loopLinkNode5);
        System.out.println("loopLinkNode5 isRing:" + isLoopRing5);


    }

    public static boolean isRing(ListNode head) {
        return solution1(head);
    }

    public static boolean solution1(ListNode head) {
        if (head == null) {
            return false;
        }
//        if (head.next == null) {
//            return false;
//        }
//        if (head.next.next == null) {
//            return false;
//        }

        ListNode slowNode = head;
        ListNode quickNode = head.next;
        while (slowNode !=null && quickNode != null) {
            if (slowNode == quickNode) {
                return true;
            }
            slowNode = slowNode.next;
            if (quickNode.next == null) {
                return false;
            }
            quickNode = quickNode.next.next;

        }
        return false;
    }

}
