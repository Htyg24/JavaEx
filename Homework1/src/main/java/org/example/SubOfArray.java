package org.example;

public class SubOfArray {

    public static int[] SubOfArray(int[] firstArr, int[] secondArr){
        if (firstArr.length != secondArr.length) {
            throw new RuntimeException("Arrays have different lengths");
        }
        int[] arr = new int[firstArr.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = firstArr[i] - secondArr[i];
        }
        return arr;
    }
}
