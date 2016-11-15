package com.mytest.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bjhl on 11/5/16.
 */

public class Test {
    public static void main(String[] args) throws Exception {

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("111");

        System.out.println(set);
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

}
