package com.rendiputra.pbo.modul2.latihan;

import java.util.Random;
import java.util.Scanner;

public class TestCaseAbc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukan jumlah test case yang akan dijalankan (1 - 10): ");
        int n_test_case = scan.nextInt();
        int a, b, c, hasil;

        for (int i = 1; i <= n_test_case; i++) {
            a = rand.nextInt(100);
            b = rand.nextInt(100);
            c = rand.nextInt(100);

            System.out.print("\n" + String.valueOf(a) + " + " + String.valueOf(b) + " - " + String.valueOf(c) + " = ");

            hasil = a + b - c;
            System.out.println(hasil);
        }
    }
}
