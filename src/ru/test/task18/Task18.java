package ru.test.task18;

import java.util.Scanner;

public class Task18 {

    static int write() {
        boolean flag = true;
        int a = 0;
        while (flag) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                a = input.nextInt();
                flag = false;
            } else {
                System.out.print("\nВведите целое число: ");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Введите первое число: ");
        a = write();
        System.out.print("\nВведите второе число: ");
        b = write();
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
    }
}

