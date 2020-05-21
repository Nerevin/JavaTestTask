package ru.test.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.print("Введите номер месяца: ");

        while(flag) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int a = input.nextInt();
                if (a <= 12 && a > 0) {

                    if (a <= 2 || a == 12) {
                        System.out.println("Зима");
                    }
                    else if (a <= 5) {
                        System.out.println("Весна");
                    }
                    else if (a <= 8) {
                        System.out.println("Лето");
                    }
                    else if (a <= 11) {
                        System.out.println("Осень");
                    }

                    flag = false;
                }
                else {
                    System.out.println("Введите число от 1 до 12: ");
                }
            }
            else {
                System.out.println("Введите число от 1 до 12: ");
            }
        }
    }
}
