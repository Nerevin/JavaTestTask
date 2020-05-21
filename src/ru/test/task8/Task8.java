package ru.test.task8;

public class Task8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + ", " + b + ", ");
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            if (i == 11) {
                System.out.print(c);
            }
            else {
                System.out.print(c + ", ");
                a = b;
                b = c;
            }
        }
    }
}
