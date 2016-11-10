package com.mytest.my.test.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bjhl on 10/31/16.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 1, 27, 49, 78, 34, 12, 64, 1 };

        List<Integer> list = Arrays.asList( 49, 38, 65, 97, 76, 13, 1, 27, 49, 78, 34, 12, 64, 1);

        //直接插入排序
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                //将大于temp的往后移动一位
                a[j + 1] = a[j];
            }
            //            for (j = i - 1; j >= 0; j--) {
            //                //将大于temp的往后移动一位
            //                if (a[j] > temp) {
            //                    a[j + 1] = a[j];
            //                } else {
            //                    break;
            //                }
            //            }
            a[j + 1] = temp;
        }
//        System.out.println("排序之后：");
//        System.out.println(Arrays.toString(a));

    }

    static {

        int[] a = { 49, 38, 65, 97, 76, 13, 1, 27, 49, 78, 34, 12, 64, 1 };

        for(int i= 1 ;i<a.length;i++) {
            int temp = a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }

        System.out.println(Arrays.toString(a));

    }
}
