package com.algo.learn.array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayRepeat {

    public static void main(String[] args) {
        int[] array = new int[] {3,3};
        boolean result = containsDuplicate(array);
        System.out.println("result:" +  result);
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.size() != 0) {
                if (map.contains(nums[i])) {
                    return true;
                }
            }
            map.add(nums[i]);
        }
        return false;
    }
}
