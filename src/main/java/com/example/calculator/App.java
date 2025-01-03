package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ErrorManager;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        int result = 0;
        String exits;

        try{
            while(true){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                num2 = sc.nextInt();

                if(num1>=0 && num2>=0){
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    operator= sc.next().charAt(0);

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
                    /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                    System.out.println("결과: "+num1+operator+num2+"=" + result);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    /* exit을 입력 받으면 반복 종료 */
                    exits = sc.next();
                    if(exits.equals("exit")){
                        break;
                    }
                } else {
                    System.out.println("0이상 정수만 입력하세요.");
                }
            }
        } catch (InputMismatchException e){
            e.printStackTrace();    //예외정보 출력
//            ErrorManager log;
//            log.error("InputMismatchException ERROR: {} ", e.getMassage()); //로그남김
            throw e;  //예외 던지기
        }



    }
}