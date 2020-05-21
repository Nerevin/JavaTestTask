package ru.test.task16;

class Animals {
    static final int ageTop = 10;
    static final double weightTop = 10.5;
    static final double highTop = 70.5;

    String name;
    int age;
    double weight;
    double high;
    Animals() {
        age = 5;
        weight = 8.5;
        high = 50.2;
    }
    Animals(String name, int age, double weight, double high) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.high = high;
    }
    void info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + high);
    }
    void compareTop() {
        if(age > ageTop) {
            System.out.println("Старше " + ageTop);
        }
        else if (age < ageTop) {
            System.out.println("Младше " + ageTop);
        }
        else {
            System.out.println("Пороговый возраст " + ageTop);
        }

        if(weight > weightTop) {
            System.out.println("Тяжелее " + weightTop);
        }
        else if (weight < weightTop) {
            System.out.println("Легче " + weightTop);
        }
        else {
            System.out.println("Пороговый вес " + weightTop);
        }

        if(high > highTop) {
            System.out.println("Выше " + highTop);
        }
        else if (high < highTop) {
            System.out.println("Ниже " + highTop);
        }
        else {
            System.out.println("Пороговый рост " + highTop);
        }
    }
    void compare(String name) {
        System.out.println(this.name.equals(name));
    }
}
