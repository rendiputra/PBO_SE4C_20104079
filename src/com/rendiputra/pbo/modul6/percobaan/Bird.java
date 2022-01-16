package com.rendiputra.pbo.modul6.percobaan;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(this.name + " flies!\n");
    }
}
