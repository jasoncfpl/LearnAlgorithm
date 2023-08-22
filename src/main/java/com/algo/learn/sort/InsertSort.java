package com.algo.learn.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[] {4,5,6,3,1,2};
        System.out.println("array1:" + Arrays.toString(array));
//        insertSort(array);
        insertSortOpt(array);
        System.out.println("array2:" + Arrays.toString(array));

        System.out.println(InsertSort.class.getClassLoader());
        System.out.println(InsertSort.class.getClassLoader().getParent());
        System.out.println(InsertSort.class.getClassLoader().getParent().getParent());
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 优化
     * @param array
     */
    public static void insertSortOpt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];//记录要插入的数
            int j = i;
            System.out.println("i:" +i);
            for (; j > 0 && array[j-1]>tmp; j--) {
                    array[j] = array[j-1];
            }
            System.out.println("i:" +i + "--j:" + j);
            array[j] = tmp;
            System.out.println("array:" + Arrays.toString(array));
        }

//        for(int i=1; i<array.length; i++){
//            int temp = array[i];//保存每次需要插入的那个数
//            int j;
//            for(j=i; j>0&&array[j-1]>temp; j--){//这个较上面有一定的优化
//                array[j] = array[j-1];//吧大于需要插入的数往后移动。最后不大于temp的数就空出来j
//            }
//            array[j] = temp;//将需要插入的数放入这个位置
//        }


    }
}
