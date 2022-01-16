package com.rendiputra.pbo.modul9.latihan;

import javax.swing.*;

public class Latihan3 {
    public static void main( String args[] ) {
        try {
            throw new ExceptionC();
        } catch( ExceptionA a ) {
            JOptionPane.showMessageDialog( null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE );
        }

        try {
            throw new ExceptionB();
        } catch( ExceptionA b ) {
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE );
        }
        System.exit( 0 );
    }
}

class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}
