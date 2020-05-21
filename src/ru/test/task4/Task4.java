package ru.test.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        long result = 1;
        boolean a = true;
        while(a) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число для рассчета факториала: ");

            if (input.hasNextInt()) {
                int n = input.nextInt();
                while(true) {
                    if(n == 1) break;
                    result *= n;
                    n--;
                }
                System.out.println(result);
                a = false;
            }
            else {
                System.out.println("Вы ввели не число, попробуйте еще раз");
            }
        }
    }
}
