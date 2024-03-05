package org.example;

public class ExceptionsDemo {

    public static void main (String[] args){
        int a = 4;
        int b=7;
        int c=0;
        int k;

        try
        {
           /* k=b/c;
            System.out.println(k);*/
            int array[] = {1,2,32};
            System.out.println(array[3]);
        }
        catch (ArithmeticException ae){
            System.out.println("Zero division!!!");
        }
        catch (IndexOutOfBoundsException outOfBoundsException){
            System.out.println("Index out of bound!!");
        }
        catch(Exception e){
            System.out.println("Error caught!!!");
        }

    }
}
