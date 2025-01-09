package com.example.calculator3;

import java.util.*;

public class App{
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            double num1 = 0.0;
            while (true) {
                try {
                    System.out.println("첫 번째 숫자를 입력하세요:");
                    // Scanner를 사용하여 숫자를 입력받고 적합한 타입의 변수에 저장합니다.
                    num1 = sc.nextDouble();
                    break;

                // 숫자가 아닌 값을 입력하면 이에 대한 예외처리를 합니다.
                } catch (InputMismatchException e) {
                    System.err.println("숫자만 입력하세요.");
                    sc.nextLine();
                }
            }

            double num2 = 0.0;
            while (true) {
                try {
                    System.out.println("두 번째 숫자를 입력하세요:");
                    // Scanner를 사용하여 숫자를 입력받고 적합한 타입의 변수에 저장합니다.
                    num2 = sc.nextDouble();
                    break;

                // 숫자가 아닌 값을 입력하면 이에 대한 예외처리를 합니다.
                } catch (InputMismatchException e) {
                    System.err.println("숫자만 입력하세요.");
                    sc.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.println("사칙연산 기호를 입력하세요:");
                    System.out.println("+ - * /");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    char operator = sc.next().charAt(0);

                    // 나눗셈 연산에서 0으로 나누지 못하도록 처리합니다.
                    if (operator == '/' && num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        cal.calculate(num1, num2, operator);
                        break;
                    }
                // 사칙연산이 아닌 값을 입력하면 이에 대한 예외처리를 합니다.
                } catch (NullPointerException e) {
                    System.err.println("사칙연산 기호만 입력하세요.");
                    sc.nextLine();
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exits = sc.next();
            // exit을 입력 받으면 반복을 종료하기 위한 다음 질문으로 넘어갑니다.
            if (exits.equals("exit")) {
                System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? y/n");
                // y를 입력 받으면 가장 먼저 저장된 데이터를 삭제합니다.
                String removeOk = sc.next();
                if (removeOk.equals("y")) {
                    cal.removeResult();
                // y가 아닌 다른 값을 입력 받으면 삭제하지 않고 종료합니다.
                } else if (removeOk.equals("n")) {
                    System.out.println("삭제하지 않고 종료합니다.");
                } else {
                    System.out.println("삭제하지 않고 종료합니다.");
                }
                while(true) {
                    try {
                        System.out.println("숫자를 입력하세요.");
                        //저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력하기 위해 값을 받습니다.
                        double inputValue = sc.nextDouble();
                        cal.readResult(inputValue);
                        break;
                    // 숫자가 아닌 값을 입력하면 이에 대한 예외처리를 합니다.
                    } catch (InputMismatchException e) {
                        System.err.println("숫자만 입력하세요.");
                        sc.nextLine();
                    }
                }
                break;
            }
        }
        // 결과값을 저장한 리스트의 값을 가져옵니다.
        cal.getResultList();
        System.out.println(cal.getResultList());
        }
}