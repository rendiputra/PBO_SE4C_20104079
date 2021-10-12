package com.rendiputra.pbo.modul2.latihan;

public class CeritaAnakAyam {
    public static void main(String[] args) {
        turun(10);
    }

    public static void turun(int anakAyam) {
        int temp;
        for (int i = anakAyam; i >= 0; i--) {
            temp = i - 1;

            if (i > 1) {
                System.out.println("Anak ayam turun " + i);
                System.out.println("Mati 1 tingal " + temp);
            } else if (i == 1){
                System.out.println("Anak ayam turun " + i);
                System.out.println("Mati 1 tinggal induknya");
            }
        }
    }
}

