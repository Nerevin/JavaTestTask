package ru.test.task17;

public class Trapeze implements Base{
    int a;
    int b;
    int h;
    Trapeze(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public void square() {
        System.out.println(((a + b) * h ) / 2);
    }
}
