package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> id = new ThreadLocal<>();

    public static void main(String[] args) {
        id.set(1);

        new Thread(new Runnable() {
            @Override public void run() {
                id.set(2);
            }
        }).start();

        System.out.println(id.get());
    }
}
