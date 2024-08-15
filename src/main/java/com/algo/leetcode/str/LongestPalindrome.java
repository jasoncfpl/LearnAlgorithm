package com.algo.leetcode.str;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 */
public class LongestPalindrome {

    public static void main(String[] args) {

       test( "babad","bab");
       test( "cbbd","bb");
       test( "ac","a");
       test( "a","a");
       test( "jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispasrgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaowsbakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuflttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoegamlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmyghmwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvhxsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbammlzrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx","a");
    }


    public static void test(String s,String rightResult) {
        String result = longestPalindromeTimeError(s);
//        String result = longestPalindrome(s);
        if (result.equals(rightResult)) {
            System.out.println("---通过--- " + s);
        } else {
            System.out.println("---出现错误---:" + s + " 正确结果为:" + rightResult + ",实际结果为:" + result);
        }
    }

    public static String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        List result = new ArrayList();

        if (s.length() == 1) {
            return s;
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int middle = s.length() / 2;


        System.out.println("result----:" + result);
        StringBuilder sb = new StringBuilder();
        for (Object o : result) {
            sb.append(o);
        }

        return sb.toString();
    }

    /***
     * 超出时间限制
     * s ="jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispasrgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaowsbakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuflttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoegamlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmyghmwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvhxsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbammlzrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx"
     * @param s
     * @return
     */
    public static String longestPalindromeTimeError(String s) {

        char[] chars = s.toCharArray();
        List result = new ArrayList();

        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < chars.length; i++) {
            List<Character> list = new ArrayList<>();

            list.add(chars[i]);
            if (i == 0) {
                result = new ArrayList(list);
            }

            for (int j = i + 1; j < chars.length; j++) {
                list.add(chars[j]);
                List nList = new ArrayList(list);
                System.out.println("list:" + list.toString());
                Collections.reverse(nList);
                System.out.println("nList:" + nList.toString());

                if (list.equals(nList)) {
                    System.out.println("----equal:" + list.toString());
                    if (result.size() < list.size()) {
                        result = new ArrayList(list);
                    }
                } else {
                    System.out.println("=====not equal");
                }
            }
        }
        System.out.println("result----:" + result);
        StringBuilder sb = new StringBuilder();
        for (Object o : result) {
            sb.append(o);
        }

        return sb.toString();
    }
}
