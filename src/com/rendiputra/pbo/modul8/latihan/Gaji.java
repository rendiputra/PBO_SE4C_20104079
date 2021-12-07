package com.rendiputra.pbo.modul8.latihan;

public class Gaji extends Pegawai
{
    private double salary; //Gaji Tahunan
    public Gaji(String name, String address, int number,
                double
                        salary){
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Menghitung pembayan gaji untuk  " + getName());
        return salary / 52;
    }
}
