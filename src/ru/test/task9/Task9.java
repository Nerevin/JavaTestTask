package ru.test.task9;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int)(Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        for(int i = 1; i < arr.length; i+=2) {
            arr[i] = 0;
        }
        System.out.println("");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
