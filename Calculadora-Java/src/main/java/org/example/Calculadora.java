package org.example;

public class Calculadora {
    public void realizarOperacao(String operacao, int numero1, int numero2){
        if (operacao.equals("soma")){
            System.out.println(numero1 + numero2);
        } else if (operacao.equals("menos")) {
            System.out.println(numero1 - numero2);
        } else if (operacao.equals("multiplicar")) {
            System.out.println(numero1*numero2);
        } else{
            System.out.println(numero1/numero2);
        }
    }
}
