package com.rendiputra.pbo.modul3.latihan;

public class Tabungan {
    public int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah <= getSaldo()) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
}
