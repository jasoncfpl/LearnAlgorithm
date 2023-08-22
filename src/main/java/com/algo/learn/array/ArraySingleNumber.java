package com.algo.learn.array;

import java.util.Arrays;

/**
 只出现一次的数字
 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

 示例 1:
 输入: [2,2,1]
 输出: 1

 作者：力扣 (LeetCode)
 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 来源：力扣（LeetCode）
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ArraySingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};

        System.out.println("before:" + Arrays.toString(nums));
        singleNumber(nums);
        System.out.println("after:" + Arrays.toString(nums));
    }

    //最慢 时间复杂度为 n的 k 次方
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

        }
        return 1;
    }


}
