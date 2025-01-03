package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */


        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char calculator;
        int result = 0;
        String exit;

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
                calculator= sc.next().charAt(0);

                switch(calculator){
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
                System.out.println("결과: "+num1+calculator+num2+"=" + result);

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
                exit = sc.next();
                if(exit.equals("exit")){
                    break;
                }
            }
        }


    }
}