package com.rendiputra.pbo.modul7.percobaan;

public class House {
    public static void main(String[] args) {
        TV tv = new TV("LG");
        AC ac = new AC("Panasonic");

        Electronics lamp = new Electronics("Philips");
        Electronics device = new Electronics();

        tv.onActivate();
        ac.onActivate();
        lamp.activate();
        device.activate();

        tv.deactivate();
        ac.deactivate();
        lamp.deactivate();
        device.deactivate();
    }
}
