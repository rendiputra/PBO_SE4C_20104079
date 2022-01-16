package com.rendiputra.pbo.modul4.percobaan;

public class Bank2 {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Rendi", 52341523);
        Tabungan kamu = new Tabungan(
                "Putra",
                534150234,
                500_000,
                12412
        );

        System.out.println("Saldo awal saya : " + saya.getSaldo());
        System.out.println("Saldo awal kamu : " + kamu.getSaldo());

        System.out.println("Pin saya : " + saya.getPin());
        System.out.println("Pin kamu : " + kamu.getPin());

        saya.simpanUang(200_000);
        kamu.tarikUang(10_000);

        System.out.println("\nSaldo saya : " + saya.getSaldo());
        System.out.println("Saldo kamu : " + kamu.getSaldo());
    }
}
