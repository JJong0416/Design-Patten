package com.designpatterns.creational_pattern._01_singleton.livecoding;

public class Settings {

    private static Settings INSTANCE;

    private Settings() {}

    public static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return Settings.INSTANCE;
    }
}

