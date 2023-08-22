package com.algo.learn.sort;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 冒泡排序
 */
public class BubbleSort {

    //循环次数
    static int count = 0;
    public static void main(String[] args) {
//        int[] array = new int[] {7,5,6,3,1,2};
//        int[] array = new int[] {7,5,6,3,2,1};
        int[] array = new int[] {1,2,3,4,5,6};
        System.out.println("array1:" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("count:" + count);
        System.out.println("array2:" + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            //是否发生交换
            int isSwap = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                boolean b = array[j] > array[j + 1];
                if (b) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSwap = 1;
                }
                count ++;
            }
            System.out.println("array:" + Arrays.toString(array));
            //如果没有发生交换，说明已经有序，不需要再循环
            if (isSwap == 0) {
                return;
            }
        }
    }
}
