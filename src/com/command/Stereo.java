package com.command;

public class Stereo {

    public void on() {
        System.out.println("Stereo system is on");
    }

    public void off() {
        System.out.println("Stereo system is off");
    }

    public void setCd() {
        System.out.println("Cd is set");
    }

    public void setDvd() {
        System.out.println("Dvd is set");
    }

    public void setRadio() {
        System.out.println("Radio is set");
    }

    public void setVolume(int level) {
        System.out.println("Setup volume level: " + level);
    }
}
