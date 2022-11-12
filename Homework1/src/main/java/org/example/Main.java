//1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.

//2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив,
//        каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение,
//        которое пользователь может увидеть - RuntimeException, т.е. ваше.


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FillArray fillArray = new FillArray();
        SubOfArray subOfArray = new SubOfArray();
        Scanner scn = new Scanner(System.in);
        PrintArray printArray = new PrintArray();

        int l = scn.nextInt();
        int[] firstArr = fillArray.FillArray(l);
        printArray.PrintArray(firstArr);
        l = scn.nextInt();
        int[] secondArr = fillArray.FillArray(l);
        printArray.PrintArray(secondArr);
        printArray.PrintArray(subOfArray.SubOfArray(firstArr, secondArr));
    }


}