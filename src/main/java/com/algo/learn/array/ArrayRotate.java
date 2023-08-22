package com.algo.learn.array;

import java.util.Arrays;

/**
 * 初级算法-旋转数组
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 *  
 *
 * 进阶：
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 例
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class ArrayRotate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;

//        int[] nums = new int[]{-1,-100,3,9};
//        int k = 2;
        System.out.println("before:" + Arrays.toString(nums));
//        rotate(nums,k);
//        rotateOpt1(nums,k);
        rotateOpt2(nums,k);
        System.out.println("after:" + Arrays.toString(nums));
    }

    //最慢 时间复杂度为 n的 k 次方
    public static void rotate(int[] nums, int k) {
        for (int i = 0;i < k; i++) {
            int tmp = nums[nums.length - 1];
            for (int j = nums.length - 1; j >= 0; j-- ) {
                if (j > 0) {
                    nums[j] = nums[j-1];
                }
            }
            nums[0] = tmp;
        }
    }

    //优化 时间复杂度为 n
    public static void rotateOpt1(int[] nums, int k) {
        if (k == 0 || nums.length <= 1) {
            return;
        }
        int[] tmp = Arrays.copyOf(nums,nums.length);
        for (int i = 0; i < tmp.length; i++) {
            if (i + k < tmp.length) {
                nums[i + k] = tmp[i];
            } else {
                int index = (i + k) % tmp.length;
                nums[index] = tmp[i];
            }

        }
    }

    //优化 时间复杂度为 n
    public static void rotateOpt2(int[] nums, int k) {
        if (k == 0 || nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        int[] tmp = new int[nums.length];
        System.arraycopy(nums,k + 1,tmp,0,nums.length-k-1);
        System.arraycopy(nums,0,tmp,nums.length-k-1,k + 1);
        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }
    }
}
