package com.rendiputra.pbo.modul7.latihan;

public class Kapal extends Kendaraan {
    public Kapal() {
    }

    public Kapal(String name) {
        super(name);
    }

    public Kapal(String name, String bahanBakar) {
        super(name, bahanBakar);
    }

    @Override
    public void berjalan() {
        System.out.println(this.getName() + " berlayar menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " berhenti dan mengeluarkan jangkar.");
    }
}
