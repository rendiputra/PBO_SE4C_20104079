package com.rendiputra.pbo.modul9.percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int b = 10;

        // menjalankan syntax dahulu
        try {
            System.out.println(b / 0);
        // tangkap error
        } catch (ArithmeticException e) {
            System.out.println("Error: Hasil tak terhingga!");
        }
    }
}
