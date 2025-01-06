package com.example.calculator3;

public enum OperatorType {
    PLUS("+"), MINUS("-"), MULTIPLY("*"),DIVIDE("/");

    //값을 저장할 필드(인스턴스 변수)를 추가
    private final String value;
    // 생성자를 추가
    OperatorType(String value){this.value = value; }

    public String getValue(){return value;}

    public static OperatorType findByVal(String val) {
        for (OperatorType op : values()) {
            if (val != null){
                if (val.equals(op.value)) {
                    return op;
                }
            }
        }
        return null;
    }
}

