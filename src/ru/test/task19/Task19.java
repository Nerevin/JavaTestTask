package ru.test.task19;

public class Task19 {
    public static void main(String[] args) {
        Patty patty = new Patty();
        Hood hood = new Hood();
        Grandmother grandmother = new Grandmother();
        Woodman woodman = new Woodman();
        Wolf wolf = new Wolf();
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }
}
