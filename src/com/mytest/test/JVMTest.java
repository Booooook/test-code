package com.mytest.test;

import javax.xml.transform.Source;

/**
 * Created by bjhl on 11/6/16.
 */
public class JVMTest {

    //    public static final Boolean TRUE = new Boolean(true);
    public int a = 10;
    public static final Integer b = new Integer(2);

        public static void main(String[] args) {
            System.out.println(B.a);
//
//            Boolean bool1=true;
//
//
//    //        Boolean.valueOf()
//
//            Boolean bool2=true;
//
//            System.out.println(bool1==bool2); //输出true
//
//            //浮点类型的包装类没有实现常量池技术
//
//            Double d1=1.0;
//
//            Double d2=1.0;
//
//            System.out.println(d1==d2); //输出false
        }

//    public static int test(){
//        int x;
//        try {
//            x=1;
//            throw new Exception();
//        } catch (Exception e) {
//            x=2;
//            return x;
//        } finally {
//            x=3;
//        }
//    }
//
//    public JVMTest(int a) {
//        this.a = a;
//    }
//
//    public JVMTest() {
//    }
}
interface A {
    static int a=1;
}

class B{
    public static int a=2;
}
class C extends B implements A{
    public static int a=3;
}