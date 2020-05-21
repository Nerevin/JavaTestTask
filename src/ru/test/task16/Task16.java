package ru.test.task16;

public class Task16 {
    public static void main(String[] args) {
        Animals doge = new Animals("Шарик", 4, 5.5, 55.2);
        Animals cat = new Animals("Барсик", 12, 15, 80);
        doge.info();
        cat.info();
        doge.compareTop();
        cat.compareTop();
        doge.compare(cat.name);
    }
}
