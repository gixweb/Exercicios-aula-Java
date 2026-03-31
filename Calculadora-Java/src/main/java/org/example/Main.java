package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número que quer calcular: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número que quer calcular: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite a operação que deseja realizar");
        String operacao = scanner.next();

        calculadora calculadora = new calculadora();
        calculadora.RealizarOperacao(operacao, numero1, numero2);
    }
}