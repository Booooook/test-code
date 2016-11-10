package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 * //测试sleep是否释放锁
 */
public class SleepTest {

    public static void main(String[] args) {
        SleepTest t = new SleepTest();

        new Thread(new Runnable() {
            @Override public void run() {
                t.test(1);
//                try {
//                    Thread.sleep(1000 * 5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("1 out....");
            }
        }).start();

        new Thread(new Runnable() {
            @Override public void run() {
                t.test(2);
//                System.out.println("2 out....");
            }
        }).start();
    }

    public synchronized void test(int i) {
        System.out.println(i+"\tmethod\tin");
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i+"\tmethod\tout");
    }

}
