package org.example;

public class PS2 extends PS3{
    int a;

    public PS2(int a) {
        super(a);//parent class constructor is invoked
        this.a=a;
    }

    public int increment()
    {
     a++;
     return a;
    }
    public int decrement()
    {
        a--;
        return a;
    }
}
