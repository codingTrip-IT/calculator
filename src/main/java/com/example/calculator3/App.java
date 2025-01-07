package com.example.calculator3;

import java.util.*;

public class App{
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator cal = new ArithmeticCalculator();

        Scanner sc = new Scanner(System.in);
        String exits;
        String removeOk;

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요:");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요:");
            double num2 = sc.nextDouble();

            if(num1>=0 && num2>=0){
                System.out.print("사칙연산 기호를 입력하세요:");
                char operator = sc.next().charAt(0);

                cal.calculate(num1,num2,operator);

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                exits = sc.next();
                if(exits.equals("exit")){
                    System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? y/n");
                    removeOk = sc.next();
                    if(removeOk.equals("y")){
                        cal.removeResult();
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
        cal.getResultList();
        System.out.println(cal.getResultList());
    }
}