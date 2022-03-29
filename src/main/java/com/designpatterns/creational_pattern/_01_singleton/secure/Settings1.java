package com.designpatterns.creational_pattern._01_singleton.secure;

public class Settings1 {

    private static volatile Settings1 instance;

    private Settings1() {

    }

//    public static Settings getInstance(){
//        if (instance == null){
//            instance = new Settings();
//        }
//        return instance;
//    }
    // 이 부분은 쓰레드 세이프하지 않음

//    public static synchronized Settings getInstance(){
//        if (instance == null){
//            instance = new Settings();
//        }
//        return instance;
//    }

    public static Settings1 getInstance(){
        if (instance == null){
            synchronized (Settings1.class) { // settings.class를 락으로 쓰게 하고
                if (instance == null){
                    instance = new Settings1();
                }
            }
        }
        return instance;
    }



    // case1. synchronized 키워드 사용 => Lock을 풀고 여는데 성능 이슈 발생
    // case2. private static final Settings INSTANCE = new Settings(); 로 eager initialization(이른 초기화) 사용
    // case2의 단점은? 미리 만든다는 것 자체가 단점이 될 수 있다. 만약 인스턴스를 만드는 과정이 길고 메모리를 많이 사용한다면
    // 애플리케이션 로딩할 때 많은 시간이 소모된다. 근데 만약 사용하지 않는다면?

    // case3. double checked locking 사용(synchronizd + volatile) => 가장 효율적인 동기화 블럭 만들기
}
