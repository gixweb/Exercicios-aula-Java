package org.example;

import java.util.Scanner;

public class calculadora {
    public void RealizarOperacao(String operacao, int numero1, int numero2){
        if (operacao.equals("soma")){
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (operacao.equals("menos")) {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if (operacao.equals("multiplicar")) {
            System.out.println("Resultado: " + (numero1*numero2));
        } else{
            System.out.println("Resultado: " + (numero1/numero2));
        }
    }
}
