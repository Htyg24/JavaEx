package org.example;

import java.util.Random;

public class FillArray {

    public int[] FillArray(int length, int min, int max){
        int[] arr =new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++){
            arr[i] = rnd.nextInt(min, max);
        }
        return arr;
    }

    public int[] FillArray(int length, int max){
        int min = 0;
        int[] arr =new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++){
            arr[i] = rnd.nextInt(min, max);
        }
        return arr;
    }

    public int[] FillArray(int length){
        int min = 0;
        int max = 100;
        int[] arr =new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++){
            arr[i] = rnd.nextInt(min, max);
        }
        return arr;
    }
}
