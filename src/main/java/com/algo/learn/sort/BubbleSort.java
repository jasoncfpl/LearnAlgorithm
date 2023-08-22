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
    public static void main(String[] args) {
        int[] array = new int[] {7,5,6,3,1,2};
        System.out.println("array1:" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("array2:" + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                boolean b = array[j] > array[j + 1];
                if (b) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            System.out.println("array:" + Arrays.toString(array));
        }
    }
}
