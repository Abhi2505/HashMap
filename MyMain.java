package com.LearnHashmap;

import java.util.HashMap;
import java.util.HashSet;

class Parent{
    public void walk(){
        System.out.println("parent walk");
    }
    public void run(){
        System.out.println("parent run");
        System.out.println(this.toString());
        walk();
    }
}
class child extends Parent{
    public void walk(){
        System.out.println("child walk");
        super.walk();
    }
    public void run(){
        System.out.println("child run");
        super.run();
    }
}
public class MyMain {

    public static void main(String[] args) {
//        Parent p=new child();
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        // Integer caching for values between -128 and 127
        System.out.println(a == b); // This should print true
        System.out.println(c == d); // This should print false

      // p.run();//what is the output of above code if p.run is called
        //if it went to same bucket then equals would be called
//        Student st1=new Student();
//        st1.setRollno(1);
//        st1.setName("Abhi1");
//        Student st2=new Student();
//        st2.setRollno(2);
//        st2.setName("Aish2");
//        Student st3=new Student();
//        st3.setRollno(2);
//        st3.setName("Aish2");
//        HashSet<Student>hs=new HashSet<>();
//        System.out.println(st1.hashCode()+" "+st2.hashCode()+" "+st3.hashCode());
//        hs.add(st1);
//        hs.add(st2);
//        hs.add(st3);
//        System.out.println(hs.size());
//
//        st2.setRollno(3);
//        System.out.println();
//        System.out.println(hs);
//
//        HashMap<Student,String>h=new HashMap<>();
//        h.put(st1, st1.getName());
//        h.put(st2,st2.getName());
//        h.put(st3,st3.getName());
//        Student st4=new Student();
//        st4.setRollno(3);
//        st4.setName("Aish4");
//        h.put(st4,st4.getName());
//        System.out.println(h);
//        st2.setRollno(2);
//        st4.setRollno(2);
//        System.out.println(h);
//        System.out.println(h.get(st4));
//        System.out.println(h.containsKey(st4));

    }
}
