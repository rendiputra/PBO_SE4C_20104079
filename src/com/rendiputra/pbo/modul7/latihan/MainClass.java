package com.rendiputra.pbo.modul7.latihan;

public class MainClass {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Mobil F1");
        Mobil mobil = new Mobil("Avanza", "Pertamax");
        Kapal kapal = new Kapal("Titanic", "Batu bara");
        Pesawat pesawat = new Pesawat("Boeing", "Aftur");

        kendaraan.berjalan();
        mobil.berjalan();
        kapal.berjalan();
        pesawat.berjalan();
        System.out.println();

        kendaraan.berhenti();
        mobil.berhenti();
        kapal.berhenti();
        pesawat.berhenti();

    }
}
