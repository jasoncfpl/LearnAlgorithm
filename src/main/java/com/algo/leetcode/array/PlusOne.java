package com.algo.leetcode.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *  
 *
 * 提示：
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9

 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 结论：
 * 方案1 直接计算
 */
public class PlusOne {

    public static void main(String[] args) {
//        int[] origin = {1,2,3};
        int[] origin = {4,3,2,1};
//        int[] origin = {0};
//        int[] origin = {9};
        System.out.println("origin:" + Arrays.toString(origin));
        long start = System.currentTimeMillis();
        int[] result = plusOne(origin);
        long end = System.currentTimeMillis();
        System.out.println("result:" + Arrays.toString(result));
        System.out.println("耗时：" +(end - start));
    }
    //方案1
    public static int[] plusOne(int[] digits) {
        //是否需要进位
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1 || carry) {
                if (digits[i] + 1 > 9) {
                    digits[i] = 0;
                    carry = true;
                } else {
                    digits[i] = digits[i] + 1;
                    carry = false;
                }
            } else {
                break;
            }
        }
        //是否需要进位
        if (carry) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            for (int i = 0; i < digits.length - 1; i++) {
                tmp[i+1] = digits[i];
            }
            digits = tmp;

        }
        return digits;
    }

}
