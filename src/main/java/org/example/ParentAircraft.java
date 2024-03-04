package org.example;

public abstract class ParentAircraft {
    public void engine(){
        System.out.println("Follow engine guidelines");
    }
    public void safetyGuidelines(){
        System.out.println("Safety guidelines");
    }
    public abstract void bodyColor();
}
