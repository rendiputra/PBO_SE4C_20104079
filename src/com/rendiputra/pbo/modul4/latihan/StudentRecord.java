package com.rendiputra.pbo.modul4.latihan;

public class StudentRecord {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    /**
     * Jika ingin menghitung jumlah siswa maka kita bisa menghitung dengan bantuan method Constructor dengan
     * memanggil method setStudentCount untuk meng-increment-kan nilai studentCount.
     *
     * Berikut contoh penggunaannya(Silahkan hilangkan komentar untuk menjalankannya):
     */

/**
    public StudentRecord() {
        setStudentCount();
    }
    public static void setStudentCount() {
        StudentRecord.studentCount++;
    }
*/

    public String getName(){
        return name;
    }

    public void setName( String temp ){
        name = temp;
    }

    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    }

    public static int getStudentCount(){
        return studentCount;
    }
}
