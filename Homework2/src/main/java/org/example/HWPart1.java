
//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.





package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HWPart1 {
    public static void main(String[] args) {

        ScanFloat();

    }

    public static float ScanFloat(){
        Scanner scanner = new Scanner(System.in);
        try {
            float f = scanner.nextFloat();
        }
        catch (InputMismatchException e){
            System.out.println("Введите коректные данные");
            return ScanFloat();
        }
        return 1f;
    }
}