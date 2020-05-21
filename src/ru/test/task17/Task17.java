package ru.test.task17;

public class Task17 {
    public static void main(String[] args) {
        Base[] arr = new Base[4];
        arr[0] = new Triangle(4, 6);
        arr[1] = new Circle(5);
        arr[2] = new Rectangle(3, 5);
        arr[3] = new Trapeze(5, 4, 3);
        for (int i = 0; i < arr.length; i++) {
            arr[i].square();
        }
    }
}
