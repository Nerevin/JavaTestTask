package ru.test.task17;

public class Triangle implements Base{
    int a;
    int b;
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void square() {
        System.out.println((a*b)/2);
    }
}
