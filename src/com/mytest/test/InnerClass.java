package com.mytest.test;

/**
 * Created by bjhl on 11/7/16.
 */
public class InnerClass {

    interface A0 {
        int a=0;
    }

    interface A1 extends A0{
        int a = 1;
    }

    static class B0 {
        public static int a=2;
    }
    static class B1 extends B0 implements A1 {
        public static int a=3;
    }

    public static void main(String[] args) {
        System.out.println(B1.a);
    }
}
