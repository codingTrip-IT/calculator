package com.example.calculator2;

import java.util.*;

public class Calculator {
    /* 필드 영역 */
    private int num1;
    private int num2;
    private char operator;
    private int result = 0;
    private ArrayList<Integer> resultList = new ArrayList<>();

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

    public int getResult() {
        return result;
    }

    public ArrayList<Integer> getResultList(){
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

    public int setResult(int result) {
        this.result = result;
        return result;
    }

    public ArrayList<Integer> setResultList(){
        this.resultList = resultList;
        return resultList;
    }

    /* 생성자 영역 */

    /* 메서드 영역 */
    public int calculate(int num1, int num2, char operator) {

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
//                if (num2 == 0) {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    break;
//                }
                result = num1 / num2;
                break;
            default:
                System.out.println("사칙연산자가 아닙니다. 다시 입력해주세요.");
                break;
        }
        System.out.println("결과: "+num1+operator+num2+"=" + result);
        resultList.add(result);
        System.out.println("resultList: "+resultList);
        return result;
    }

    public void removeResult() {
        resultList.remove(0);
    }
}