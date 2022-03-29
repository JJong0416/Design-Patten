package com.designpatterns.creational_pattern._01_singleton.secure;

public enum Settings3  {

    INSTANCE;

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    // Enum은 리플랙션도 막아준다. reflection에서 newInstance를 막아뒀기 때문에 유일한 인스턴트가 된다.
    // 단점은 Enum은 클래스를 쓰는 순간, 즉 로딩하는 순간 이미 만들어진다.
    // 뿐만 아니라, 직렬화와 역직렬화를 방지할 수 있다.
    // 단점2 : 상속을 쓰지 못한다. enum은 enum만 상속받을 수 있다.
}
