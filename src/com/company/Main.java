package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String tipoDeOperacao;
        double valor1, valor2, resultado;

        System.out.println("Tipos de operação: + (Adição), - (Subtração), * (Multiplicação), / (Divisão) ");
        System.out.print("Indique o tipo de operação, conforme a mensagem acima: ");
        tipoDeOperacao = ler.nextLine();

        if(tipoDeOperacao != "+"){
            System.out.println("Favor inserir um tipo de operação válido");
        }else if (tipoDeOperacao != "-"){
            System.out.println("Favor inserir um tipo de operação válido");
        }else if(tipoDeOperacao != "*"){
            System.out.println("Favor inserir um tipo de operação válido");
        }else if(tipoDeOperacao != "/"){
            System.out.println("Favor inserir um tipo de operação válido");  
        }


        System.out.print("Insira um valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Insira um segundo valor: ");
        valor2 = ler.nextDouble();

        ler.close();

        switch (tipoDeOperacao)
        {
            case "+":
                resultado = valor1 + valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "-":
                resultado = valor1 - valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "*":
                resultado = valor1 * valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "/":
                resultado = valor1 / valor2;
                System.out.println("O resultado é: " + resultado);
                break;
            default:
                System.out.println("Insira um tipo de operação válido");
        }
    }
}
