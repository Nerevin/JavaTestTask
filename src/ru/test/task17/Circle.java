package ru.test.task17;

import org.apache.commons.math3.util.Precision;

public class Circle implements Base {
    double r;
    Circle(double r) {
        this.r = r;
    }
    @Override
    public void square() {
        System.out.println(Precision.round(Math.PI, 4) * Math.pow(r, 2));
    }
}
