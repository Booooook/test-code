package com.mytest.test;

/**
 * Created by bjhl on 11/5/16.
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);// 输出true
        System.out.println(c == d);// 输出false

    }
}
