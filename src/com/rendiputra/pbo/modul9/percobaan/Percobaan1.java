package com.rendiputra.pbo.modul9.percobaan;

public class Percobaan1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        // menjalankan syntax dahulu
        try {
            a[5] = 100;
            System.out.println("Nilai array a = " + a[5]);
        // tangkap error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks Array melebihi batas!");
        }

    }
}
