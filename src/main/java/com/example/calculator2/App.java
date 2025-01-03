package com.example.calculator2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);
        String exits;

            while(true){
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();

                if(num1>=0 && num2>=0){
                    System.out.print("사칙연산 기호를 입력하세요:");
                    char operator = sc.next().charAt(0);

                    cal.calculate(num1,num2,operator);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    /* exit을 입력 받으면 반복 종료 */
                    exits = sc.next();
                    if(exits.equals("exit")){
                        cal.removeResult();
                        break;
                    }
                } else {
                    System.out.println("0이상 정수만 입력하세요.");
                }
            }
        cal.getList();
        System.out.println(cal.getList());
    }
}