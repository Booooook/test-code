package com.mytest.my.test.sort;

import java.util.Arrays;

/**
 * Created by bjhl on 11/1/16.
 */
public class BubbleSort {

    public static void main(String[] args) {

//        int[] a = { 49, 38, 65, 97, 76, 13, 1, 27, 49, 78, 34, 12, 64, 1 };

//        int[] a = { 1, 2, 5, 8, 76};
        int t1 = -1;
        int t2= 2;

        t1=t1^t2;
        t2=t1^t2;
        t1=t1^t2;

        System.out.println(t1+" "+t2);

        System.out.println(1.0-0.42);

        int[] a = { 8,7,6,5,4,3,2};
        boolean token = true;
        int i = a.length - 1;
        while (i > 0 && token) {
            token=false;
            for (int j = i; j > 0; j--) {
                if (a[j]<a[j-1]){
                    a[j]=a[j]^a[j-1];
                    a[j-1]=a[j]^a[j-1];
                    a[j]=a[j]^a[j-1];
                    token=true;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
