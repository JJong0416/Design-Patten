package com.designpatterns.creational_pattern._01_singleton.livecoding;

public class App {
    public static void main(String[] args) {
        Settings singleton1 = Settings.getInstance();
        Settings singleton2 = Settings.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
