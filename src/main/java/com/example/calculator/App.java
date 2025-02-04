package com.example.calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            while(true){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
               int  num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num2 = sc.nextInt();

                if(num1>=0 && num2>=0){
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    char operator= sc.next().charAt(0);

                    int result = 0;
                    // 각 사칙연산 기호에 해당하는 계산을 수행합니다.
                    switch(operator){
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
                            // 나눗셈 연산에서 0으로 나누지 못하도록 처리합니다.
                            if (num2 == 0) {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                                break;
                            }
                            result = num1 / num2;
                            break;
                        default:
                            System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                            break;
                    }
                    System.out.println("결과: "+num1+operator+num2+"=" + result);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    // exit을 입력 받으면 반복을 종료합니다.
                    String exits = sc.next();
                    if(exits.equals("exit")){
                        break;
                    }
                } else {
                    System.out.println("0이상 정수만 입력하세요.");
                }
            }
    }
}