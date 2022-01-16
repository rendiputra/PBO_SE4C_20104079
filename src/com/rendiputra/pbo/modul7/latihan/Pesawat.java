package com.rendiputra.pbo.modul7.latihan;

public class Pesawat extends Kendaraan{
    public Pesawat() {
    }

    public Pesawat(String name) {
        super(name);
    }

    public Pesawat(String name, String bahanBakar) {
        super(name, bahanBakar);
    }

    @Override
    public void berjalan() {
        System.out.println(this.getName() + " lepas landas menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " landing di bandara.");
    }
}
