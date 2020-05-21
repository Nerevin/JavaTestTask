package ru.test.task3;

public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        int mult = 1;
        while(mult <= 300 && sum <= 200 ) {
            System.out.println(i);
            System.out.println(sum + " " + mult);
            i += 3;
            sum += i;
            mult *= i;
        }
    }
}
