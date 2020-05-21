package ru.test.task14;

import java.util.ArrayList;
import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer i = 1; i <= 99; i += 2) {
            arr.add(i);
        }
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
    }
}
