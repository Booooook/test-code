package com.mytest.ConcurrentTest;

/**
 * Created by bjhl on 11/7/16.
 */
public class Test {

    public static void main(String[] args) {

        A a= new A();
        new Thread(new Runnable() {
            @Override public void run() {
                a.test();
            }
        }).start();

        new Thread(new Runnable() {
            @Override public void run() {
                a.test2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override public void run() {
                a.test3();
            }
        }).start();



    }
}


class A {

    Object o = new Object();

    public synchronized void test(){
        System.out.println("test1  in.....");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1  out.....");
    }

    public synchronized void test2(){
        synchronized (this) {
            System.out.println("test2  in.....");
            try {
                Thread.sleep(1000 *3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test2  out.....");
        }
    }

    public void test3(){
        synchronized(o){
            System.out.println("test3...");
        }
    }
}
