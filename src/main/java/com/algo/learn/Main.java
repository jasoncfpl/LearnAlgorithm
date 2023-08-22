package com.algo.learn;

public class Main {
    public static void main(String[] args) {
//        testMy1("12345","123");
        add("12345","127");
        addStrings("12345","127");
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        System.out.println("addStrings:" + ans.toString());
        return ans.toString();
    }


    private static String add(String s1,String s2) {

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        int l1 = s1Array.length - 1;
        int l2 = s2Array.length - 1;

        boolean isBig = false;
        int carry = 0;
        int sum = 0;
        while (l1 >= 0 || l2 >=0) {
            int s1Num = 0;
            if (l1 <0) {
                s1Num = 0;
            } else {
                s1Num = Character.getNumericValue(s1Array[l1]);
            }
            int s2Num = 0;
            if (l2 < 0) {
                s2Num = 0;
            } else {
                s2Num = Character.getNumericValue(s2Array[l2]);
            }

            int sum1 =  s1Num + s2Num;
             if (isBig) {
                 sum1 += 1;
                 isBig= false;
             }
             if (sum1 > 10) {
                 isBig = true;
                 sum1 -= 10;
             }
            for (int i=0;i < carry;i++) {
                sum1*=10;
            }
            sum += sum1;
             l1--;
             l2--;
             carry++;
        }
        System.out.println("add sum:" + sum);
        return String.valueOf(sum);
    }

    private static String testMy1(String s1,String s2) {
        char[] s1Arrays = s1.toCharArray();
        char[] s2Arrays = s2.toCharArray();

        int length1 = s1Arrays.length-1;
        int length2 = s2Arrays.length-1;

        int bigLength = 0;
        if (length1 >= length2) {
            bigLength = length1;
        } else {
            bigLength = length2;
        }

        return "";
    }
}
