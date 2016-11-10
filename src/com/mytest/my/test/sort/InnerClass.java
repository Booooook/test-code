package com.mytest.my.test.sort;

/**
 * Created by bjhl on 11/4/16.
 */
public class InnerClass {
    private int a;

    public int getA(){
        return a;
    }



    class Inner {
        int b=1;

        public int getData(){
            return a+b;
        }
    }


}
