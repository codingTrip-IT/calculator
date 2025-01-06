package com.example.calculator3;

public enum OperatorType {
    PLUS("+"), MINUS("-"), MULTIPLY("*"),DIVIDE("/");

    //값을 저장할 필드(인스턴스 변수)를 추가
    private final String value;
    // 생성자를 추가
    OperatorType(String value){this.value = value; }

    public String getValue(){return value;}

    // 매개변수가 null이 아니고 enum의 값이 매개변수와 같으면 enum의 값을 리턴하라
    public static OperatorType findByVal(String val) {
        for (OperatorType v : values()) {
            if (val != null && val.equals(v.value)) {
                    return v;
            }
        }
        return null;
    }
}

