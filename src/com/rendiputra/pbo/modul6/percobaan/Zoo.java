package com.rendiputra.pbo.modul6.percobaan;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal("Leon");
        Animal unknown = new Animal();
        Bird eagle = new Bird("Eagle", 5);
        Cat cat = new Cat("Miya", 3, "Black");

        System.out.println("Lion name: " + lion.name);
        System.out.println("Lion age: " + lion.age);
        System.out.println();

        System.out.println("Unknow name : " + unknown.name);
        System.out.println("Unknow name : " + unknown.age);
        System.out.println();

        System.out.println("Bird name : " + eagle.name);
        System.out.println("Bird name : " + eagle.age);
        System.out.println();
        eagle.walk();
        eagle.fly();
        System.out.println();;

        System.out.println("cat name : " + cat.name);
        System.out.println("cat name : " + cat.age);
        System.out.println();
        cat.walk();
    }
}
