package org.example;

import java.util.*;

public class hashMapExample {
    public static void main (String[] args){
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(0,"Hello");
        hm.put(1,"Goodbye");
        hm.put(2,"Good morning");
        hm.put(3, "Good evening");
        System.out.println(hm.get(2));
        hm.remove(1);
        System.out.println(hm);
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        while (it.hasNext()){
            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }






    }
}
