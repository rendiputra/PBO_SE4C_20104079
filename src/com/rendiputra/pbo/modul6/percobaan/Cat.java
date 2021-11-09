package com.rendiputra.pbo.modul6.percobaan;

public class Cat extends Animal {
    public String color = "";


    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public  void walk() {
        System.out.println(this.color + " " + this.name + " walks!\n");
    }
}
