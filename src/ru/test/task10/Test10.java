package ru.test.task10;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8};
        try {
            System.out.print(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        finally {
            arr[0] = 2;
            System.out.println("Значение первого элемента массива инициализировано");
        }
    }
}
