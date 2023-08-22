package com.algo.learn;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *示例 1：
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 *
 *示例 2：
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 *
 *
 */
public class DelRepeatNumber {
    public static void main(String[] args) {
//        int[] numbers = new int[]{1,1,2};
        int[] numbers = new int[]{0,0,1,1,1,2,2,3,3,4};

        delRepeatNumber(numbers);
//        removeDuplicates(numbers);
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1;right <= nums.length - 1; right++) {
            if (nums[right] != nums[right - 1]) {
                left ++;
                nums[left] = nums[right];
            }
        }
        System.out.println("nums:" + nums);
        return left+1;
    }
    /**
     * 双指针实现
     * @param numbers
     * @return
     */
    private static int delRepeatNumber(int[] numbers) {

        int left = 0;
        int right = 1;
        while (right <= numbers.length-1) {
            if (numbers[right-1] != numbers[right]) {
                left++;
                numbers[left] = numbers[right];

            }
            right++;
        }
        System.out.println("length:"+ left);
        System.out.println("numbers:"+numbers);
        return -1;
    }


}
