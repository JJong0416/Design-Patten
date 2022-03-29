package com.designpatterns.creational_pattern._01_singleton.danger;

public class Settings {

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }
        return instance;
    }
}
