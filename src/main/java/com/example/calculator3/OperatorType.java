package com.example.calculator3;

public enum OperatorType {
//    PLUS("+"), MINUS("-"), MULTIPLY("*"),DIVIDE("/");
    PLUS('+'), MINUS('-'), MULTIPLY('*'),DIVIDE('/');

    //값을 저장할 필드(인스턴스 변수)를 추가
    private final char value;
    // 생성자를 추가
    private OperatorType(char value){this.value = value; }

    public char getValue(){return value;}

    // 매개변수가 null이 아니고 enum의 값이 매개변수와 같으면 enum의 값을 리턴하라
    public static OperatorType findByVal(char val) {
        OperatorType[] values = OperatorType.values();
        for (OperatorType v : values) {
            if (val==v.value) {
                    return v;
            }
        }
        return null;
    }
}

