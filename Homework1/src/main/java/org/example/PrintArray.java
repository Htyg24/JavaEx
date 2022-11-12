package org.example;

public class PrintArray{
    public void PrintArray(int[] array){
        for (Object c: array){
            System.out.printf(c.toString() + ", ");
        }
        System.out.println();
    }
}
