package org.example;

public class nestedLoop {
    public static void main (String[] args){
        int k=3;
        for (int i=4; i>1; i--) {

            for (int j = 0; j<= 4-i; j++) {
               System.out.print(k+"  ");
               k=k+3;
            }
            System.out.println();
        }
    }
}
