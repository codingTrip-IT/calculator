package com.example.calculator3;

import java.util.*;

public class ArithmeticCalculator<T extends Number>{

    /* 필드 영역 */
    private List<Double> resultList = new ArrayList<>();

    /* Getter 메서드 구현 */
    public List<Double> getResultList(){
        return resultList;
    }

    /* Setter 메서드 구현 */
    public void setResultList(List<Double> resultList){
        this.resultList = resultList;
    }

    /* 메서드 영역 */
    // calculate : App 클래스에서 매개변수를 받아서 사칙연산을 계산하는 메서드
    public double calculate(T num1, T num2, char operator) {
        double result = 0.0;
        // Scanner로 입력받은 연산자가 enum의 값과 같은지 확인합니다.
        OperatorType op = OperatorType.findByVal(operator);

        switch (op) {
            case PLUS:
                // num1과 num2가 int타입이면 int로 값을 반환해서 계산합니다.
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() + num2.intValue();
                // num1과 num2 중 하나라도 double타입이면 double 값을 반환해서 계산합니다.
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() + num2.doubleValue();
                }
                break;
            case MINUS:
                // num1과 num2가 int타입이면 int로 값을 반환해서 계산합니다.
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() - num2.intValue();
                // num1과 num2 중 하나라도 double타입이면 double 값을 반환해서 계산합니다.
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() - num2.doubleValue();
                }
                break;
            case MULTIPLY:
                // num1과 num2가 int타입이면 int로 값을 반환해서 계산합니다.
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() * num2.intValue();
                // num1과 num2 중 하나라도 double타입이면 double 값을 반환해서 계산합니다.
                } else if (num1 instanceof Double || num2 instanceof Double) {
                    result = num1.doubleValue() * num2.doubleValue();
                }
                break;
            case DIVIDE:
                // num1과 num2가 int타입이면 int로 값을 반환해서 계산합니다.
                if (num1 instanceof Integer && num2 instanceof Integer){
                    result = num1.intValue() / num2.intValue();
                // num1과 num2 중 하나라도 double타입이면 double 값을 반환해서 계산합니다.
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

    // addResult : 결과값을 리스트에 저장하는 메서드
    public void addResult(double result) {
        resultList.add(result);
        System.out.println("결과 리스트: "+resultList);
    }

    // removeResult : 결과값을 저장한 리스트 중 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        resultList.remove(0);
    }

    // compareResult : 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력하는 메서드
    // 람다 & 스트림 활용
    public void compareResult(Double inputValue) {
        resultList.stream()
                  .filter(result -> inputValue < result)
                  .forEach(result -> System.out.println(inputValue + "보다 더 큰 숫자는 " + result));

    }
}
