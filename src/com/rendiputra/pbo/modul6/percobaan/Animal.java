package com.rendiputra.pbo.modul6.percobaan;

public class Animal {
    public String name = "Unanmed Animanl";
    public  int age = 0;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println(this.name + " walks!\n" );
    }
}
