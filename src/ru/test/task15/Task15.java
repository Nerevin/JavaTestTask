package ru.test.task15;

import java.util.ArrayList;

public class Task15 {
    public static void main(String[] args) {
        double[] arr1 = {1, 2, 3};
        double[] arr2 = {3, 0, 6, 10, 2};
        ArrayList<Double> result = new ArrayList<>();
        int a = (arr1.length > arr2.length) ? arr2.length : arr1.length;
        for (int i = 0; i < a; i++) {
            result.add(arr1[i]/arr2[i]);
        }
        System.out.print(result);
    }
}
