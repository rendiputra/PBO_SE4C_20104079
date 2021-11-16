package com.rendiputra.pbo.modul7.latihan;

public class Kendaraan {
    private String name = "";
    private String bahanBakar = "";

    public Kendaraan() {
    }

    public Kendaraan(String name) {
        this.name = name;
    }

    public Kendaraan(String name, String bahanBakar) {
        this.name = name;
        this.bahanBakar = bahanBakar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public void berjalan() {
        System.out.println(this.getName() + " berjalan.");
    }
    public void berhenti() {
        System.out.println(this.getName() + " berhenti.");
    }
}
