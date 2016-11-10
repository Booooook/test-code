package com.mytest.my.test.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bjhl on 11/1/16.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 49, 8 };
        //快速排序
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private static void quickSort(int[] a, int low, int high) {
        if (low<high){
            int middle = divide(a,low,high);
            quickSort(a,low,middle-1);
            quickSort(a,middle+1,high);
        }
    }

    public static int divide(int[] a ,int low,int high) {
        int temp = a[low];
        while (low<high) {
            while (low<high && a[high]>temp){
                high--;
            }
            a[low]=a[high];
            while (low<high && a[low]<=temp){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=temp;
        return low;
    }

//    private static void quickSort(int[] a, int low, int high) {
//        if (low < high) { //如果不加这个判断递归会无法退出导致堆栈溢出异常
//            int middle = getMiddle(a, low, high);
//            quickSort(a, 0, middle - 1);
//            quickSort(a, middle + 1, high);
//        }
//    }

//    private static int getMiddle(int[] a, int low, int high) {
//        int temp = a[low];//基准元素
//        while (low < high) {
//            //找到比基准元素小的元素位置
//            while (low < high && a[high] >= temp) {
//                high--;
//            }
//            a[low] = a[high];
//            while (low < high && a[low] <= temp) {
//                low++;
//            }
//            a[high] = a[low];
//        }
//        a[low] = temp;
//        return low;
//    }
}
