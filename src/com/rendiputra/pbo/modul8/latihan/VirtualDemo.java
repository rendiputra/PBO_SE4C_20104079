package com.rendiputra.pbo.modul8.latihan;

public class VirtualDemo{
    public static void main(String [] args){
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();


        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}

