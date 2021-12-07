package com.rendiputra.pbo.modul8.percobaan;

public class Salary extends Employee {
    private double annualSalary;

    public Salary(String name, String address, int number, int salary) {
        super(name, address, number);
        this.annualSalary = salary;
    }

    public void checkMail() {
        System.out.println("Checking mails for "  + getName());
        System.out.println("With annual salary of $" + annualSalary);
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualSalary(double newSalary) {
        if(newSalary >= 0) {
            this.annualSalary = newSalary;
        } else {
            System.out.println("Error: Negative salary is NOT allowed!");
        }
    }

    public double computeSalary() {
        System.out.println("Calculating salary for " + getName() + "...");
        return annualSalary / 52;
    }

    public String toString() {
        return annualSalary + "";
    }
}
