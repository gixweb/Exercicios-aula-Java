package org.example;

import java.util.Scanner;

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

        Calculadora calculadora = new Calculadora();
        calculadora.realizarOperacao(operacao, numero1, numero2);
    }
}