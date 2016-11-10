package com.mytest.test;

/**
 * Created by bjhl on 11/10/16.
 */
public class InterfaceTest {

    public static void main(String[] args) {
        InterfaceTest t = new InterfaceTest();
        A a = t.new C();
        a.test();

    }


    interface A {
        public void test();
    }

    interface B {
        public void test();
    }

    class C implements A,B {


        @Override
        public void test() {
            System.out.println(111);
        }

//        @Override
//        public int test() {
//            System.out.println(111);
//            return 222;
//        }

    }
}
