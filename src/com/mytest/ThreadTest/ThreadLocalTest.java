package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> id = new ThreadLocal<>();

    public static void main(String[] args) {

        String s = "ENTERPRISE_CUSTOM";
        System.out.println(s.toLowerCase());
    }
}
