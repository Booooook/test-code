package com.mytest.ThreadTest;

import java.util.concurrent.Executors;

/**
 * Created by bjhl on 11/9/16.
 */
public class JoinTest {

    public static void main(String[] args) {
        JoinTest t = new JoinTest();

        Thread t1 = new Thread(new Runnable() {
            @Override public void run() {
                t.test(1);
            }
        });

//        Executors.newFixedThreadPool(1).

//        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("222222");

        new Thread(new Runnable() {
            @Override public void run() {
                t.test(1);
            }
        }).start();
    }



    public void test(int i) {
        System.out.println(i+"\tmethod\tin");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i+"\tmethod\tout");
    }
}
