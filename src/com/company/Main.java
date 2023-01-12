package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char tipoDeOperacao;
        double valor1, valor2, resultado;

        System.out.println("Tipos de operação: + (Adição), - (Subtração), * (Multiplicação), / (Divisão) ");
        System.out.print("Indique o tipo de operação, conforme a mensagem acima: ");
        tipoDeOperacao = ler.next().charAt(0);

        if(tipoDeOperacao == '+'){
            System.out.println("Você selecionou uma Adição");
        }else if (tipoDeOperacao == '-'){
            System.out.println("Você selecionou uma Subtração");
        }else if(tipoDeOperacao == '*'){
            System.out.println("Você selecionou uma Multiplicação");
        }else if(tipoDeOperacao == '/'){
            System.out.println("Você selecionou uma Divisão");  
        }else{
            System.out.println("Favor inserir um tipo de operação válido");
            System.exit(0);
        }


        System.out.print("Insira um valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Insira um segundo valor: ");
        valor2 = ler.nextDouble();

        ler.close();

        switch (tipoDeOperacao)
        {
            case '+':
                resultado = valor1 + valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '-':
                resultado = valor1 - valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '*':
                resultado = valor1 * valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '/':
                resultado = valor1 / valor2;
                System.out.println("O resultado é: " + resultado);
                break;
            default:
                System.out.println("Insira um tipo de operação válido");
        }
    }
}
