package com.algo.leetcode;

import java.util.*;

/**
 * 最大单词长度乘积
 * 给定一个字符串数组 words，找到 length(word[i]) * length(word[j])的最大值，并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。
 *
 * 示例1:
 *
 * 输入: ["abcw","baz","foo","bar","xtfn","abcdef"]
 * 输出: 16
 * 解释: 这两个单词为 "abcw", "xtfn"。
 * 示例 2:
 *
 * 输入: ["a","ab","abc","d","cd","bcd","abcd"]
 * 输出: 4
 * 解释: 这两个单词为 "ab", "cd"。
 * 示例 3:
 *
 * 输入: ["a","aa","aaa","aaaa"]
 * 输出: 0
 * 解释: 不存在这样的两个单词。
 *  
 *
 * 提示：
 *
 * 2 <= words.length <= 1000
 * 1 <= words[i].length <= 1000
 * words[i] 仅包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-word-lengths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxWordLengthProduct {

    public static void main(String[] args) {
        String[] origin = {"abcw","baz","foo","bar","xtfn","abcdef"};
//        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
//        String[] words = {"a","ab","abc","d","cd","bcd","abcd"};
//        String[] words = {"a","aa","aaa","aaaa"};
        List<String> list = new ArrayList<>();
        List<String> tmp = Arrays.asList(origin);
        for (int i = 0; i < 8; i++) {
            list.addAll(tmp);
            tmp = list;
        }
        String[] words = list.toArray(new String[list.size()]);

        System.out.println("words.length:" + words.length);
        System.out.println("list.length:" + list.size());

        long start = System.currentTimeMillis();
        int result = calculate(words);
        long end = System.currentTimeMillis();
        System.out.println("result:" + result);
        System.out.println("time:" + (end -start));

        long start2 = System.currentTimeMillis();
        int result2 = maxProduct(words);
        long end2 = System.currentTimeMillis();
        System.out.println("result2:" + result2);
        System.out.println("time2:" + (end2 -start2));

        long start3 = System.currentTimeMillis();
        int result3 = maxProductSet(words);
        long end3 = System.currentTimeMillis();
        System.out.println("result3:" + result3);
        System.out.println("time3:" + (end3 -start3));
    }

   /**暴力方法，效率一般**/
   static int calculate(String[] words) {
       System.out.println("origin" + Arrays.toString(words));
       int maxWordLengthProduct = 0;
       String first;
       String second;
       for (int i = 0; i < words.length; i++) {
           first = words[i];
           for (int j = i; j < words.length; j++) {
               second = words[j];
               int tmp = first.length() * second.length();
               if (tmp <= maxWordLengthProduct) {
                   continue;
               }
               if (!hasSameChar(first,second)) {
//                   System.out.println("tmp:" + tmp);
//                   System.out.println("maxWordLengthProduct:" + maxWordLengthProduct);
                   maxWordLengthProduct = tmp;

               }
           }
       }
        return  maxWordLengthProduct;
    }

    /**
     * 判断连个字符串是否存在相同字母
     * @return
     */
   static boolean hasSameChar(String str1,String str2) {
        boolean hasSameChar = false;
        for (char c : str1.toCharArray()) {
            for (char c1 : str2.toCharArray()) {
                if (c == c1) {
                    hasSameChar = true;
                    break;
                }
            }
        }
//        System.out.println("hasSameChar word1:" + str1 + "==word2:" + str2);
//        System.out.println("hasSameChar " + hasSameChar);
        return hasSameChar;
   }

   /**位运算 --效率最高 **/
   public static int maxProduct(String[] words) {
        int n = words.length;
        int[] wordsBit = new int[n];
        for (int i = 0; i < n; i++) {

            wordsBit[i] = convertWordToBit(words[i]);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if ((wordsBit[i] & wordsBit[j]) == 0) {

                    int newLength = words[i].length() * words[j].length();
                    max = max < newLength ? newLength : max;
                }
            }
        }
        return max;
   }
   private static int convertWordToBit(String word) {

        int wordBit = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {

            wordBit = wordBit | (1 << (word.charAt(i) - 'a'));
        }
        return wordBit;
   }


    /** set方法 --效率一般**/
    public static int maxProductSet(String[] words) {
        int ans=0;
        Set<Character>[] st=new Set[words.length];
        for(int i=0;i<words.length;i++) st[i]=new HashSet();
        for(int i=0;i<words.length;i++)
            for(int j=0;j<words[i].length();j++)
                st[i].add(words[i].charAt(j));
        for(int i=0;i<words.length;i++)
            for(int j=i+1;j<words.length;j++)
            {
                boolean flag=false;
                for(int h=0;h<words[i].length();h++)
                {
                    if(st[j].contains(words[i].charAt(h)))
                    {
                        flag=true;
                        break;
                    }
                }
                if(!flag) ans=Math.max(ans, words[i].length()*words[j].length());
            }

        return ans;
    }

}
