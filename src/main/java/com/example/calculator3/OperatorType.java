package com.example.calculator3;

public enum OperatorType {
    PLUS('+'), MINUS('-'), MULTIPLY('*'),DIVIDE('/');

    //값을 저장할 필드(인스턴스 변수)
    private final char value;
    // 생성자
    private OperatorType(char value){this.value = value; }
    //getter 메서드
    public char getValue(){return value;}

    // enum의 값이 매개변수와 같으면 enum의 값을 리턴합니다.
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

