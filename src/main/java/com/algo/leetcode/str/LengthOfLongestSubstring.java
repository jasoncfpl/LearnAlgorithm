package com.algo.leetcode.str;

import java.util.*;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * * 输入: s = "au"
 *  * 输出: 2
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        test("abcabcbb", 3);
        test("bbbbb", 1);
        test("pwwkew", 3);
        test("au", 2);
        test("a", 1);
        test("aab", 2);
        test("", 0);
        test("dvdf", 3);
        test("ohvhjdml", 6);
        test("jbpnbwwd", 4);
        test("wobgrovw", 6);


    }

    public static void test(String s,int rightResult) {
        int result = lengthOfLongestSubstring1(s);
        if (result != rightResult) {
            System.out.println("---出现错误---:" + s + " 正确结果为:" + rightResult + ",实际结果为:" + result);
        } else {
            System.out.println("---通过--- " + s);
        }
    }

    public static int lengthOfLongestSubstring1(String s) {

        int maxLength = 0;

        LinkedList<String> linkedList = new LinkedList();


        char[] ss = s.toCharArray();
        //空字符串情况处理
        if (ss.length == 0) {
            return 0;
        }
        //单个字符串处理
        if (ss.length == 1) {
            return 1;
        }


        for (int i = 0; i < ss.length; i++) {
            if (linkedList.contains(String.valueOf(ss[i]))) {

                System.out.println("containsKey " + ss[i] + ",maxLength:" + maxLength + ",map:" + linkedList.toString());

                //记录最大长度
                if (maxLength < linkedList.size()) {
                    maxLength = linkedList.size();
                }

                Iterator iterator = linkedList.iterator();

                boolean hasFind = false;
                //出现重复的字符串，删除 第1个字符串到重复的字符串。
                while (iterator.hasNext() && hasFind == false) {
                    if (iterator.next().equals(String.valueOf(ss[i]))) {
                        hasFind = true;
                    }
                    iterator.remove();
                }
                //重新添加
                linkedList.add(String.valueOf(ss[i]));

                System.out.println("containsKey maxLength：" + maxLength + ",map:" + linkedList.toString());

            } else {
                //添加到链表中
                linkedList.add(String.valueOf(ss[i]));
                System.out.println("NotcontainsKey map.size():" + linkedList.size() + ",maxLength:" + maxLength);
            }

        }
        System.out.println("result map.size():" + linkedList.size() + ",maxLength:" + maxLength);
        if (linkedList.size() == ss.length) {
            maxLength = ss.length;
        }
        if (maxLength < linkedList.size()) {
            maxLength = linkedList.size();
        }

        return maxLength;
    }

}
