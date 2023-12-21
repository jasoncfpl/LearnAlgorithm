package com.algo.learn;

/**
 * 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
//        int[] arrays = new int[]{1,2,4,5,6,7,8,9};
        int[] arrays = new int[]{1,1,1,2,4,5,6,7,8,9};
//        int[] arrays = new int[]{1,2,3};
        //循环二分查找
        int index = binarySearchLoop(arrays,2);
        //递归二分查找
        int index1 =  binarySearchRecursion(arrays,0,arrays.length - 1,2);
        //寻找左边界的二分查找
        int index2 =  binarySearchLeftBoundary(arrays,2);
        System.out.println("循环index:" + index);
        System.out.println("递归index:" + index1);
        System.out.println("左侧边界二分查找index:" + index2);
    }

    /**
     * 寻找左侧边界的二分查找
     * @return
     */
    private static int binarySearchLeftBoundary(int[] array,int num) {
        if (array == null || array.length <= 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == num) {
                end = mid;
            } else if(array[mid] < num) {
                start = mid + 1;
            } else if(array[mid] > num) {
                end = mid - 1;
            }
        }
        //如果相等就找到了退出循环，不相等就是没有找到退出循环
        if (array[start] == num) {
            return start;
        }
        return -1;
    }
    /**
     * while 循环二分查找
     * @param array
     * @param num
     * @return
     */
    private static int binarySearchLoop(int[] array,int num) {
        if (array == null || array.length <= 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == num) {
                index = mid;
                break;
            } else if(array[mid] < num) {
                start = mid + 1;
            } else if(array[mid] > num) {
                end = mid - 1;
            }
        }
        return index;
    }

    /**
     * 递归二分查找
     * @param array
     * @param num
     * @return
     */
    private static int binarySearchRecursion(int[] array,int start,int end,int num) {
        if (array == null || array.length <= 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == num) {
            return mid;
        } else if(array[mid] < num) {
            return binarySearchRecursion(array, mid + 1,end,num);
        } else if(array[mid] > num) {
           return binarySearchRecursion(array, start,mid - 1,num);
        }
        return -1;
    }
}
