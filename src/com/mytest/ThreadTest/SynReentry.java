package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 * 锁重入测试
 */
public class SynReentry {
    public static void main(String[] args) {
        SynReentry s = new SynReentry();
        int i = s.add(100);
        System.out.println(i);
        new Thread(new Runnable() {
            @Override public void run() {
                System.out.println("thread in...");
                s.add(20);
                System.out.println("thread out...");
            }
        }).start();

    }


    public synchronized int add(int n){
        System.out.println(n);
        if (n==1) {
            return 1;
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n+add(n-1);
    }
}
