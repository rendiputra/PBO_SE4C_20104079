package com.rendiputra.pbo.modul9.percobaan;

public class Percobaan3 {
    public static void main(String[] args) {
        int c = 10;
        int[] d = new int[5];

        // menjalankan syntax dahulu
        try {
            System.out.println(c / 0);
            System.out.println(d[10]);
        // tangkap error
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
