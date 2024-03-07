package org.example;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("Stas");
        a.add("Java");
        a.add(0, "student");
        System.out.println(a);
       /* a.remove(1);
        System.out.println(a);
        a.remove("java");
        System.out.println(a);*/
        System.out.println(a.get(2));
        System.out.println(a.contains("testing")) ;
        System.out.println( a.indexOf("Stas")) ;
        System.out.println(a.isEmpty());
        System.out.println(a.size());




    }
}
