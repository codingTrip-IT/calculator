package com.example.calculator3;

import java.util.*;

public class ArithmeticCalculator<T extends Number>{

    /* 필드 영역 */
    private int num1;
    private int num2;
    private char operator;
    private double result = 0.0;
    private ArrayList<Double> resultList = new ArrayList<>();

    /* Getter 메서드 구현 */
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }

    public ArrayList<Double> getResultList(){
        return resultList;
    }

    /* Setter 메서드 구현 */
    public int setNum1(int num1) {
        this.num1 = num1;
        return num1;
    }

    public int setNum2(int num2) {
        this.num2 = num2;
        return num2;
    }

    public char setOperator(char operator) {
        this.operator = operator;
        return operator;
    }

    public double setResult(double result) {
        this.result = result;
        return result;
    }

    public ArrayList<Double> setResultList(){
        this.resultList = resultList;
        return resultList;
    }

    /* 생성자 영역 */

    /* 메서드 영역 */
    public Double calculate(T num1, T num2, char operator) {
        OperatorType op = OperatorType.findByVal(Character.toString(operator));

        switch (op) {
            case PLUS:
//                result = num1 + num2;
                result = num1.doubleValue() + num2.doubleValue();
//                if (num1 instanceof Integer && num2 instanceof Integer) {
//                    result = num1.intValue() + num2.intValue();
//                }
//                if (num1 instanceof Double && num2 instanceof Double) {
//                    result = num1.doubleValue() + num2.doubleValue();
//                }

                break;
            case MINUS:
//                result = num1 - num2;
                result =  num1.doubleValue() - num2.doubleValue();
                break;
            case MULTIPLY:
//                result = num1 * num2;
                result =  num1.doubleValue() * num2.doubleValue();
                break;
            case DIVIDE:
//                if (num2.doubleValue() == 0.0) {
//                    System.out.println("나눗셈 연산에서 분모(두번째 수)에 0이 입력될 수 없습니다.");
//                    break;
//                }
                result =  num1.doubleValue() / num2.doubleValue();
//                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                break;
        }
        /* return 연산 결과 */
        System.out.println("결과: "+num1+operator+num2+"=" + result);
        resultList.add(result);
        System.out.println("list"+resultList);
        System.out.println(result);
        return result;
    }

    public void removeResult() {
        /* 구현 */
        resultList.remove(0);
    }
}
