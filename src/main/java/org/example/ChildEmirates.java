package org.example;

import org.eclipse.sisu.plexus.config.Strategies;

public class ChildEmirates extends ParentAircraft{
    public static void main (String[] args){
        ChildEmirates emirates = new ChildEmirates();
        emirates.bodyColor();
        emirates.engine();
        emirates.safetyGuidelines();
    }

    @Override
    public void bodyColor() {
        System.out.println("Blue body color");
    }

}
