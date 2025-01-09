package com.example.calculator2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // Calculator 인스턴스 생성합니다.
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

            while(true){
                System.out.print("첫 번째 숫자를 입력하세요:");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요:");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num2 = sc.nextInt();

                if(num1>=0 && num2>=0){
                    System.out.print("사칙연산 기호를 입력하세요:");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    char operator = sc.next().charAt(0);

                    // 사칙연산 기호를 입력한 경우에만 calculate 메소드가 실행됩니다.
                    if(operator=='+' || operator=='-' || operator=='*' || operator=='/'){
                        // 나눗셈 연산에서 0으로 나누지 못하도록 처리합니다.
                        if(operator=='/' && num2==0){
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            continue;
                        } else {
                            cal.calculate(num1,num2,operator);
                        }
                    } else {
                        System.out.println("사칙연산자가 아닙니다. 다시 입력해주세요.");
                        continue;
                    }

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    // exit을 입력 받으면 반복을 종료하기 위한 다음 질문으로 넘어갑니다.
                    String exits = sc.next();
                    if(exits.equals("exit")){
                        System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? y/n");
                        // y를 입력 받으면 가장 먼저 저장된 데이터를 삭제합니다.
                        String removeOk = sc.next();
                        if(removeOk.equals("y")){
                            cal.removeResult();
                        // y가 아닌 다른 값을 입력 받으면 삭제하지 않고 종료합니다.
                        }else if(removeOk.equals("n")){
                            System.out.println("삭제하지 않고 종료합니다.");
                        }else{
                            System.out.println("삭제하지 않고 종료합니다.");
                        }
                        break;
                    }
                } else {
                    System.out.println("0이상 정수만 입력하세요.");
                }
            }
        // 결과값을 저장한 리스트의 값을 가져옵니다.
        cal.getResultList();
        System.out.println(cal.getResultList());
    }
}