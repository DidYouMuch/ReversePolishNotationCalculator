package me.didyoumuch;

import me.didyoumuch.calculator.Calculator;

import java.util.Scanner;

public class Core {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        System.out.println(new Calculator(expression).get());
    }
}
