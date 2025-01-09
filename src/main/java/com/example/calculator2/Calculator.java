package com.example.calculator2;

import java.util.*;

public class Calculator {
    /* 필드 영역 */
    private ArrayList<Integer> resultList = new ArrayList<>();

    /* Getter 메서드 구현 */
    public ArrayList<Integer> getResultList(){
        return resultList;
    }

    /* Setter 메서드 구현 */
    public ArrayList<Integer> setResultList(){
        this.resultList = resultList;
        return resultList;
    }

    /* 메서드 영역 */
    public int calculate(int num1, int num2, char operator) {
        int result = 0;
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