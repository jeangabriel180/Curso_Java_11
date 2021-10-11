package br.com.geekuniversity.sessao16;

import java.io.IOException;
import java.util.Scanner;

public class Programa38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("n1: ");
        int n1 = teclado.nextInt();
        System.out.println("n2: ");
        int n2 = teclado.nextInt();

        try {
            System.out.println(divisao(n1, n2));
        }
        catch (Exception e) {
            System.out.println("deu ruim");
        }
        teclado.close();

    }

    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }
}
