package ru.test.task17;

public class Rectangle implements Base {
    int a;
    int b;
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void square() {
        System.out.println(a * b);
    }
}
