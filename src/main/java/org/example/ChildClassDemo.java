package org.example;

public class ChildClassDemo extends ParentClassDemo{
    String name = "Stas";
    public static void main (String[]args){
        ChildClassDemo c = new ChildClassDemo();
        //c.colour();
        //c.Breakes();
        c.getString();
        c.getData();

    }
    public ChildClassDemo(){
        super();
        System.out.println("Child class constructor");
    }
    public void engine(){
        System.out.println("new engine");
    }
    public void colour(){
        System.out.println(colour);
    }
    public void getString(){
        System.out.println(super.name);
    }
    public void getData(){
        super.getData();
        System.out.println("child method code");
    }

}
