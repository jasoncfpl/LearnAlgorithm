package com.algo.learn.search;


public class Palindrome {

    public static void main(String[] args) {
//        String s = "level";
//        String s = "noon";
        String s = "abcbab";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(s + " isPalindrome:" + isPalindrome);
    }


    //是否是回文字符串
    private static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length; i++) {
            start = i;
            end = chars.length - 1 - i;
            if (start == end) {
                break;
            }
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
