package com.designpatterns.creational_pattern._01_singleton.secure;

public class Settings2 {

    private Settings2() {}

    private static class SettingsHolder {
        private static final Settings2 INSTANCE = new Settings2();
    }

    public static Settings2 getInstance(){
        return SettingsHolder.INSTANCE;
    }

    // case4. static inner 클래스 사용하기
    // getInstance를 호출될 때, SettingsHolder가 로딩이되고, 그때 인스턴스 생성

}
