package com.rendiputra.pbo.modul7.percobaan;

public class Electronics {
    private String name;
    private boolean isActivated = false;

    public Electronics() {
        this.name = "A device";
        System.out.println(this.getName() + " has been spawned!");
    }

    public Electronics(String name) {
        this.name = name;
        System.out.println(this.getName() + " has been spawned!");
    }

    public String getName() {
        return name;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void activate() {
        this.isActivated = true;
        System.out.println(this.getName() + " has been activated!\n");
    }

    public void deactivate() {
        this.isActivated = false;
        System.out.println(this.getName() + " has been deactivated\n");
    }

    public void onActivate() {

    }

    public void onDeactivate() {

    }

}
