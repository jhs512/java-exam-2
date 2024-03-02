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
                System.out.println("더하기");
            }

            System.out.println("입력한 값: " + cmd);
        }

        System.out.println("계산기, 끝");
    }
}