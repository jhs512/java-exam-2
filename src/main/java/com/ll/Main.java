package com.ll;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("계산기, 시작");

        while (true) {
            System.out.print("입력) ");

            Scanner scanner = new Scanner(System.in);

            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.contains("+")) {
                System.out.println("더하기 감지됨");

                String[] values = cmd.split("\\+");

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

                int result = num1 + num2;

                System.out.println("결과 : " + result);
            } else if (cmd.contains("-")) {
                System.out.println("빼기 감지됨");

                String[] values = cmd.split("\\-");

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

                int result = num1 - num2;

                System.out.println("결과 : " + result);
            } else if (cmd.contains("*")) {
                System.out.println("곱하기 감지됨");

                String[] values = cmd.split("\\*");

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

                int result = num1 * num2;

                System.out.println("결과 : " + result);
            } else if (cmd.contains("/")) {
                System.out.println("나누기 감지됨");

                String[] values = cmd.split("\\/");

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

                int result = num1 / num2;

                System.out.println("결과 : " + result);
            }
        }

        System.out.println("계산기, 끝");
    }
}