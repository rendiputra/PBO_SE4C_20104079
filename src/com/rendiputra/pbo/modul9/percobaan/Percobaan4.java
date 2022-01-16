package com.rendiputra.pbo.modul9.percobaan;

public class Percobaan4 {
    public static void main(String[] args) {
        int[] a = new int[2];

        // menjalankan syntax dahulu
        try {
            System.out.println("Akses elemen ke-3 = " + a[3]);
        // tangkap error
        } catch (Exception e) {
            System.out.println(e);
        // akhiran logika
        } finally {
            System.out.println("Apakah maksud anda elemen ke-1?");
            System.out.println("Akses elemen ke-2 = " + a[1]);
        }
    }
}
