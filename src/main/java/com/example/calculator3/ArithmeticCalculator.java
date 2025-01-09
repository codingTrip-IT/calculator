package com.example.calculator3;

import java.util.*;

public class ArithmeticCalculator<T extends Number>{

    /* 필드 영역 */
    private ArrayList<Double> resultList = new ArrayList<>();

    /* Getter 메서드 구현 */
    public ArrayList<Double> getResultList(){
        System.out.println(resultList);
        return resultList;
    }

    /* Setter 메서드 구현 */
    public ArrayList<Double> setResultList(){
        this.resultList = resultList;
        return resultList;
    }

    /* 메서드 영역 */
    public double calculate(T num1, T num2, char operator) {
        double result = 0.0;
        OperatorType op = OperatorType.findByVal(operator);
        switch (op) {
            case PLUS:
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() + num2.intValue();
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() + num2.doubleValue();
                }
                break;
            case MINUS:
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() - num2.intValue();
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() - num2.doubleValue();
                }
                break;
            case MULTIPLY:
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() * num2.intValue();
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() * num2.doubleValue();
                }
                break;
            case DIVIDE:
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() / num2.intValue();
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() / num2.doubleValue();
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                break;
        }
        /* return 연산 결과 */
        System.out.println("결과: "+num1+operator+num2+"=" + result);
        addResult(result);
        return result;
    }

    public void addResult(double result) {
        resultList.add(result);
        System.out.println("결과 리스트: "+resultList);
    }

    public void removeResult() {
        resultList.remove(0);
    }

//    - [ ]  **저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력**
//            - [ ]  추가) 람다 & 스트림 학습을 위해 여러 가지 조회 조건들을 추가하여 구현 해보시면 학습에 많은 도움이 되실 수 있습니다.
//    public void readResult(Double inputValue) {
//        for(int i=0;i<resultList.size();i++){
//            if(inputValue < resultList.get(i)){
//                System.out.println(inputValue+"보다 더 큰 숫자는 "+resultList.get(i));
//            };
//        }
//    }
    public void readResult(Double inputValue) {
        resultList.stream()
                  .filter(result -> inputValue < result)
                  .forEach(result -> System.out.println(inputValue + "보다 더 큰 숫자는 " + result));
    }
}
