package com.LearnHashmap.HashMapImplementation;

public class MyMapTest {
    public static void main(String[] args) {
        MyMap<Integer,Integer>myMap=new MyMap<>();
        myMap.put(3,4);
        myMap.put(5,6);
        myMap.put(3,7);
        System.out.println(myMap);
    }
}
