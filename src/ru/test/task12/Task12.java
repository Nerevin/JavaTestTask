package ru.test.task12;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[6][7];
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.print("\n--------------");
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i], Collections.reverseOrder());
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
