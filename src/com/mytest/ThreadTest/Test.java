package com.mytest.ThreadTest;

/**
 * Created by bjhl on 11/9/16.
 */
public class Test {

    static Integer taskNum=1000;

    public static void main(String[] args) throws InterruptedException{


        int threadNum=3;
        taskNum=1000;

        MyThread[] threads=new MyThread[threadNum];
        for(int i=0;i<threadNum;i++){
            threads[i]=new MyThread("the thread of No."+(i));
        }

        threads[0].setThread(threads[threadNum-1]);
        for(int i=1;i<threadNum;i++){
            threads[i].setThread(threads[i-1]);
        }

        for(int i=0;i<threadNum;i++){
            threads[i].start();
            //			System.out.println("------");
        }
    }

    static Integer count=1;
    static class MyThread extends Thread{
        private Thread preThread;
        public MyThread(String name) {
            super(name);
        }
        public void setThread(MyThread nextThread) {
            this.preThread = nextThread;
        }
        @Override
        public void run() {
            while (true){
                synchronized (preThread){
                    synchronized (this){
                        synchronized (count) {
                            if(count>taskNum)
                                break;
                            System.out.println(Thread.currentThread().getName()+"\t"+count++);
                        }
                        this.notify();
                    }
                    try {
                        preThread.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
