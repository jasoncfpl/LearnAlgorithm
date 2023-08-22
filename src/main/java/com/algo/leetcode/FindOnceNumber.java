package com.algo.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindOnceNumber {


    public static void main(String[] args) {
//        int nums[] = {4,1,2,1,2};
        int nums[] = {2,2,1};
        int num = singleNumber(nums);
        System.out.println("findNumber:" + num);
    }
    public static int singleNumber(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 0) {
            return -1;
        }
        int targetNum = -1;
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            targetNum = iterator.next();
        }

        return targetNum;
    }

//    public static int singleNumber2(int[] nums) {
//        if (nums == null) {
//            return -1;
//        }
//        if (nums.length == 0) {
//            return -1;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                set.remove(nums[i]);
//            } else {
//                set.add(nums[i]);
//            }
//        }
//
//    }
}
