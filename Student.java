package com.LearnHashmap;
import java.util.*;
public class Student {
    //Hashmap is non synchronized and hence is not thread safe.
    //Linked hash map is extending hashmap class and is  not synchronized and ie also not thread safe

    //In linked hashMap we can specify the access order (works as lru cache) which is by default false
    //hashmap internally uses hashtable and linkedhashmap uses doubly linked list along with hashtable and maintain order.
    //hashmap cinsume less memeory as maintain only hashtable where as lhm consumes more memory due to overhead linkedlist

    //for hashmap interanl working:

    // There is a bucket of arrays with each element representing an individual LinkedList.
    // The Inner Node class consists of a hash value, key, value, and the link to the next Node

    //Java 8 made updates to the internal implementation workflow. Once a certain threshold level is reached,
    // the values are now automatically stored in a tree manner rather than a linked list. So instead of O(n) retrieval time, we now have better O(log n) retrieval performance.


    //For the put method if collision occurs due to same hashcode then , if the bucket is not empty, then we traverse or loop through the LinkedList of that bucket. This is called a hash collision.

    // For each keyObject in the list, we call its equals(newKeyObject).

    // If it returns true, then this Entry<K, V> will be replaced by the new Entry.

    int rollno ;
    String name;

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        System.out.println("indside hashcode");
//        return 1;

        return Objects.hash(rollno, name);
    }

    @Override
    public boolean equals(Object o){
        System.out.println("indside equals");
        if(this==o){
            return true;
        }
        if(o==null){
            return false;
        }
        if(this.getClass()!=o.getClass()){
            return false;
        }
        Student st=(Student)o;
        if(this.rollno!=((Student) o).getRollno()){
            return false;
        }
        return true;
    }


}
