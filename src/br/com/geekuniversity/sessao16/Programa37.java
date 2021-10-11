package br.com.geekuniversity.sessao16;

import java.util.Scanner;

public class Programa37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = teclado.nextInt();

        try {
            System.out.println("Divsão: " + num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("impossible");
        }finally {
            System.out.println("Continua o processo...");
        }

    }
}
