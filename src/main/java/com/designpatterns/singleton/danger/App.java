package com.designpatterns.singleton.danger;

public class App {
    public static void main(String[] args) {
//        Settings settings1 = new Settings(); // 여기서 new 쓰지 않을라면 밖, 즉 settings에서 해결해야한다.
//        Settings settings2 = new Settings();
//        System.out.println(settings1 != settings2);

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1 == settings2);
    }
}
