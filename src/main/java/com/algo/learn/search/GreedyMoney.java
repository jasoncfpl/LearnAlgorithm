package com.algo.learn.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 贪心算法-找钱
 * 假设你开了间小店，不能电子支付，钱柜里的货币只有 25 分、10 分、5 分和 1 分四种硬币，如果你是售货员且要找给客户 41 分钱的硬币，如何安排才能找给客人的钱既正确且硬币的个数又最少？
 *
 * 这里需要明确的几个点：
 * 1.货币只有 25 分、10 分、5 分和 1 分四种硬币；
 * 2.找给客户 41 分钱的硬币；
 * 3.硬币最少化
 */
public class GreedyMoney {
    public static void main(String[] args) {
        //金币面值
        int[] moneys = new int[] {25,10,5,1};
        //要找给顾客的总额
        int total = 42;

        findMoney(moneys,total);
    }

    static void findMoney(int[] moneys,int total) {
        //排序

        System.out.println("moneys:" + Arrays.toString(moneys));
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        while (sum < total) {
           int num = findBiggest(moneys,total-sum);
            System.out.println("num:" + num);
           if (map.get(num) == null) {
               map.put(num,1);
           } else {
               int value = map.get(num);
               value ++ ;
               map.put(num,value);
           }
            sum += num;
        }
        System.out.println("map:" + map.toString());
    }

    static int findBiggest(int[] nums,int total) {
        System.out.println("findBiggest:" + total);
        Arrays.sort(nums);
        for (int i = nums.length -1; i >= 0; i--) {
            if (nums[i] <= total) {
                return nums[i];
            }
        }
        return -1;
    }
}
