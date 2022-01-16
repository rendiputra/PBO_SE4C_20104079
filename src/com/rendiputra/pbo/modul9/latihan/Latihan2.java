package com.rendiputra.pbo.modul9.latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print ("Masukan Angka : ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            {
                System.out.println("Angka kurang dari atau sama dengan 10");
            }
        } catch (Exception s) {
            System.out.println("Angka lebih dari 10");
        }

        System.out.println("Selesai");
    }
}

