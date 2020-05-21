package ru.test.task5;

public class Task5 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = -20; i <= 20; i++) {
            if (i%2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
