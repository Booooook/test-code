package com.mytest.designPattern;

/**
 * Created by bjhl on 11/7/16.
 */
public class Main {

    public static void main(String[] args) {

    }


    interface Assailant {
        public void punch(String name);
    }

    class Boss implements Assailant {

        @Override
        public void punch(String name) {
            System.out.println();
        }
    }

    class Errand_Boy implements Assailant{

        Boss boss;

        @Override
        public void punch(String name) {
            boss.punch(name);
        }
    }
 }


