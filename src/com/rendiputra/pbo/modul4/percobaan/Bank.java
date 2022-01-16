package com.rendiputra.pbo.modul4.percobaan;

public class Bank {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan(
          "Rendi",
          50534524,
          1_000_000,
          123
        );

        System.out.println("Nama\t: " + saya.getNama());
        System.out.println("No rek\t: " + saya.getNoRekening());
        System.out.println("Saldo\t: " + saya.getSaldo());
        System.out.println("PIN\t\t: " + saya.getPin());
    }
}
