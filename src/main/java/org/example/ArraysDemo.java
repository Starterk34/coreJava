package org.example;

public class ArraysDemo {
    public static void main (String [] args){
        int a[] = new int[5];
        a[0]=34;
        a[1]=9;
        a[2]=33;
        a[3]=11;
        a[4]=12;

        /*int b[]={7,65,89,2,1};
        for (int i=0;i<b.length; i++) {
            System.out.println(b[i]);
        }*/
        int c[][]= {{2,11,5},{3,4,7},{1,2,0}};
        int min = c[0][0];
        int column = 0;

        for (int i=0;i<c.length;i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
                if (c[i][j]<min){
                    min=c[i][j];
                    column=j;
                }
            }
            System.out.println();
        }
        int max=c[0][column];
        for(int i=0;i<c.length;i++){
            if (c[i][column]>max){
                max=c[i][column];
            }

        }
        System.out.println("Minimum value in matrix is "+min);
        System.out.println("Max value in column which holds min value of matrix is " +max);
    }
}
