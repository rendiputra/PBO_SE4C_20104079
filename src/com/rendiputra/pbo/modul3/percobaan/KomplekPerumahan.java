package com.rendiputra.pbo.modul3.percobaan;

public class KomplekPerumahan {
    public static void main(String[] args) {
        // Construct object 'r' dari class 'Rumah()'
        Rumah r = new Rumah();

        // memanggil method 'setAlamat()' milik objek 'r'
        r.setAlamat("Ini adalah alamat");

        System.out.println(r.alamatRumah);
    }
}
