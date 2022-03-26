package com.designpatterns.singleton.secure;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Settings2 settings1 = Settings2.getInstance();
//        Constructor<Settings2> constructor = Settings2.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings2 settings2 = constructor.newInstance();
//        case1. 리플랙션 -> 나도 이건 해봤음

        Settings2 settings = Settings2.getInstance();



        // case2. 직렬화 & 역직렬화 -> 오브젝트를 파일로 읽고 불러들일 때 사용하는 것 -> 이정돈 해볼 필요 없음..
        // 가능한 이유는 역직렬화 할 때, 생성자로 인스턴스로 만들어준다. 그래서 이게 또 다른 객체가 된다.
    }
}
