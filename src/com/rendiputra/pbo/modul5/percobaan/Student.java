package com.rendiputra.pbo.modul5.percobaan;

public class Student {
    private int nrp;
    private String name;

    public Student() {
        this(0, "null");
    }

    public Student(String name) {
        this.name = name;
        this.nrp = 0;
    }

    public Student(int nrp, String name) {
        this.nrp = nrp;
        this.name = name;
    }

    public int getNrp() {
        return nrp;
    }

    public String getName() {
        return name;
    }
}
