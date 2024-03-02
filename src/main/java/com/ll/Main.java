package com.ll;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("계산기, 시작");

        while (true) {
            System.out.print("입력) ");

            Scanner scanner = new Scanner(System.in);

            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.contains("+") || cmd.contains("-") || cmd.contains("*") || cmd.contains("/")) {
                char operator = ' ';

                if (cmd.contains("+")) {
                    operator = '+';
                } else if (cmd.contains("-")) {
                    operator = '-';
                } else if (cmd.contains("*")) {
                    operator = '*';
                } else if (cmd.contains("/")) {
                    operator = '/';
                }

                String[] values = cmd.split("\\" + operator);

                String num1Str = values[0].trim();
                String num2Str = values[1].trim();

                int num1 = 0;
                int num2 = 0;

                try {
                    num1 = Integer.parseInt(num1Str);
                } catch (NumberFormatException e) {
                    System.out.printf("'%s'(은)는 올바른 숫자(정수)가 아닙니다.\n", num1Str);
                    continue;
                }

                try {
                    num2 = Integer.parseInt(num2Str);
                } catch (NumberFormatException e) {
                    System.out.printf("'%s'(은)는 올바른 숫자(정수)가 아닙니다.\n", num2Str);
                    continue;
                }

                int result = switch (operator) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> 0;
                };

                System.out.println("결과) " + result);
            }
        }

        System.out.println("계산기, 끝");
    }
}