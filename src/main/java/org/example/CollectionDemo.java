package org.example;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main (String [] args){
        int[]a = {4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++){
            int k = 0;
         if (!arrayList.contains(a[i])) {
            arrayList.add(a[i]);
            k++;
            for (int j=i+1; j<a.length;j++){
                if (a[i]==a[j]){
                    k++;
                }
            }
             System.out.println(a[i] + " is presented " + k +" times");
         }
        }
    }
}
