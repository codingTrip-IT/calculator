package com.example.calculator3;

import java.util.*;

public class App{
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();

        Scanner sc = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;

        while (true) {
            while (true) {
                try {
                    System.out.println("첫 번째 숫자를 입력하세요:");
                    num1 = sc.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.err.println("숫자만 입력하세요.");
                    sc.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.println("두 번째 숫자를 입력하세요:");
                    num2 = sc.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.err.println("숫자만 입력하세요.");
                    sc.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.println("사칙연산 기호를 입력하세요:");
                    System.out.println("+ - * /");
                    char operator = sc.next().charAt(0);

                    if (operator == '/' && num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        cal.calculate(num1, num2, operator);
                        break;
                    }
                } catch (NullPointerException e) {
                    System.err.println("사칙연산 기호만 입력하세요.");
                    sc.nextLine();
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exits = sc.next();
            if (exits.equals("exit")) {
                System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? y/n");
                String removeOk = sc.next();
                if (removeOk.equals("y")) {
                    cal.removeResult();
                } else if (removeOk.equals("n")) {
                    System.out.println("삭제하지 않고 종료합니다.");
                } else {
                    System.out.println("삭제하지 않고 종료합니다.");
                }
                while(true) {
                    try {
                        System.out.println("숫자를 입력하세요.");
                        double inputValue = sc.nextDouble();
                        cal.readResult(inputValue);
                        break;
                    } catch (InputMismatchException e) {
                        System.err.println("숫자만 입력하세요.");
                        sc.nextLine();
                    }
                }
                break;
            }
        }
        cal.getResultList();
        }
}