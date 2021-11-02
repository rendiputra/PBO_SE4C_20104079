package com.rendiputra.pbo.modul5.percobaan;

public class ClassRoom {
    private int classCode;
    private String classname;
    private Student student;

    public ClassRoom(int classCode, String classname) {
        this.classCode = classCode;
        this.classname = classname;
    }

    public ClassRoom(Student student) {
        this.student = student;
    }

    public int getClassCode() {
        return classCode;
    }

    public String getClassname() {
        return classname;
    }

    public Student getStudent() {
        return student;
    }

    public String getNameStudent() {
        return student.getName();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
