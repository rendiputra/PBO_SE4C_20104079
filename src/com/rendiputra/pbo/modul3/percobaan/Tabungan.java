package com.rendiputra.pbo.modul3.percobaan;

public class Tabungan {

    // Attribute
    public int saldo;

    // Constructor method
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    // method
    public void ambilUang(int jumlah) {
        saldo -= jumlah;
    }
}
