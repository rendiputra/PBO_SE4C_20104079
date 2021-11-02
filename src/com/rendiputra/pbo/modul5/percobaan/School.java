package com.rendiputra.pbo.modul5.percobaan;

public class School {
    public static void main(String[] args) {
        ClassRoom classA = new ClassRoom(101, "Class 101");
        ClassRoom classB = new ClassRoom(202, "Class 202");
        ClassRoom classC = new ClassRoom(303, "Class 303");

        Student stdA = new Student();
        Student stdB = new Student("Rendi");
        Student stdC = new Student(2010, "Putra");

        classA.setStudent(stdA);
        classB.setStudent(stdB);
        classC.setStudent(stdC);

        System.out.println(classA.getClassname());
        System.out.println("Class code: " + classA.getClassCode());
        System.out.println("Class Student: " + classA.getNameStudent());
        System.out.println();

        System.out.println(classB.getClassname());
        System.out.println("Class code: " + classB.getClassCode());
        System.out.println("Class Student: " + classB.getNameStudent());
        System.out.println();

        System.out.println(classC.getClassname());
        System.out.println("Class code: " + classC.getClassCode());
        System.out.println("Class Student: " + classC.getNameStudent());
        System.out.println();
    }
}
