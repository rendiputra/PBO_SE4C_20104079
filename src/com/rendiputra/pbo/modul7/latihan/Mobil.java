package com.rendiputra.pbo.modul7.latihan;

public class Mobil extends Kendaraan{
    public Mobil() {
    }

    public Mobil(String name) {
        super(name);
    }

    public Mobil(String name, String bahanBakar) {
        super(name, bahanBakar);
    }

    @Override
    public void berjalan() {
        System.out.println(this.getName() + " melaju diaspal menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " berhenti.");
    }
}
