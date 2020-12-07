package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое целое число:");

        int number = s.nextInt();

        int count = 0;

        for (int i = 0; i < 6; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
        System.out.println("Введитее любое целое число до 10:");
        int numberTwo = s.nextInt();
        String numberSecond = "";
        for (int i = 1; i <= numberTwo; i++) {
            numberSecond += i;
            System.out.println(numberSecond);
        }
    }


}






