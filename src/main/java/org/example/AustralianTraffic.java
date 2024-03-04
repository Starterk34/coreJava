package org.example;

public class AustralianTraffic implements CentralTraffic,ContinentTrafic{
    public static void main(String[]args){
        CentralTraffic aussi = new AustralianTraffic();
        aussi.greenGo();
        aussi.redStop();
        aussi.flashYellow();
        AustralianTraffic aussi2 = new AustralianTraffic();
        aussi2.walkOnSymbol();
        ContinentTrafic ct = new AustralianTraffic();
        ct.trainSymbol();

    }

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("Red stop implementation");
    }

    @Override
    public void flashYellow() {
        System.out.println("Flash yellow implementation");
    }
    public void walkOnSymbol()
    {
        System.out.println("walking");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Stop on train symbol");
    }
}
