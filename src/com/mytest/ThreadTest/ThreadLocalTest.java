package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> id = new ThreadLocal<>();

    public static void main(String[] args) {

        int j=0;
        for (int i = 1; i <= 150; i++) {
            if (i%15==0)
                j++;
            if (i%3!=0 && i%5!=0)
                j++;
        }
        System.out.println(j);
    }
}
