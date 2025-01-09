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
    public void setResultList(ArrayList<Integer> resultList) {
        this.resultList = resultList;
    }

    /* 메서드 영역 */
    // calculate : App 클래스에서 매개변수를 받아서 사칙연산을 계산하는 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        // 각 사칙연산 기호에 해당하는 계산을 수행합니다.
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
        // 결과값을 리스트에 저장하는 메서드 호출
        addResult(result);
        // 결과값 반환
        return result;
    }

    // addResult : 결과값을 리스트에 저장하는 메서드
    public void addResult(int result) {
        resultList.add(result);
        System.out.println("결과 리스트: "+resultList);
    }

    // removeResult : 결과값을 저장한 리스트 중 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        resultList.remove(0);
    }


}