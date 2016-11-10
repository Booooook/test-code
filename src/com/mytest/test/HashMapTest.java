package com.mytest.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by bjhl on 11/9/16.
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(null,1);
        map.put(2,3);
        System.out.println(map);

        Hashtable<Integer,Integer> temp = new Hashtable<>();
        temp.put(null,1);
        System.out.println(temp);
    }
}
