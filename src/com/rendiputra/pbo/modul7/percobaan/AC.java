package com.rendiputra.pbo.modul7.percobaan;

public class AC extends Electronics {
    public AC() {
    }

    public AC(String name) {
        super(name);
    }

    public void onActivate() {
        System.out.println(this.getName() + " start cooling the room!\n");
    }

    public void onDeactivate() {
        System.out.println(this.getName() + " stops cooling the room!\n");
    }
}
