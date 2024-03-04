package org.example;

import org.checkerframework.checker.units.qual.C;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("constructor");
    }
    public ConstructorDemo (int a, int b){
        System.out.println("using parameters " + a + " "+ b);
    }
    public void getData(){
        System.out.println("method");
    }
    public static void main (String[] args){
        ConstructorDemo cd = new ConstructorDemo();
        cd.getData();
        ConstructorDemo cd1 = new ConstructorDemo(34, 9);
    }
}
