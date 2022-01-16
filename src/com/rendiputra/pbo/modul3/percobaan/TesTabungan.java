package com.rendiputra.pbo.modul3.percobaan;

public class TesTabungan {

    public static void main(String[] args) {

        // Construct objek 't' dari class 'Tabungan' dengan nilai aaawal saldo sebesar 5000
        Tabungan t = new Tabungan(5000);

        // Output nilai saldo awal
        System.out.println("saldo awal tabungan anda adalah : " + t.saldo);

        // panggil method ambilUang()
        t.ambilUang(1500);

        System.out.println("Jumlah uang yang diambli : 1500");

        // Sisa saldo
        System.out.println("Saldo tabungan anda sekarang adalah: " + t.saldo);

    }
}
