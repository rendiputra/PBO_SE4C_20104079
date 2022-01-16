package com.rendiputra.pbo.modul2.percobaan;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int var_a, var_b;

        System.out.println("Masukan nilai var var_a: ");
        var_a = input.nextInt();
        System.out.println("Masukan nilai var var_b :");
        var_b = input.nextInt();

        System.out.println("\n\nVariabel yang terdapat dalam program : ");
        System.out.println("Var_a = " + var_a);
        System.out.println("Var_b = " + var_b);

    }
}
