package com.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *  
 *
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶：
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 相关标签
 * 数组
 * 哈希表
 * 双指针
 * 二分查找
 *
 */
public class Intersect {
    public static void main(String[] args) {
//        int[] array1 = {1,2,2,1};
//        int[] array2 = {2,2};
        int[] array1 = {4,9,5};
        int[] array2 = {9,4,9,8,4};
        intersect(array1,array2);
    }

    public static void  intersect(int[] nums1, int[] nums2) {
        List<Integer> nArrays = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int tmp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == tmp) {
                    nArrays.add(tmp);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nArrays.toArray()));
    }
}
