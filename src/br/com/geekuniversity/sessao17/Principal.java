package br.com.geekuniversity.sessao17;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

import java.util.Scanner;

public class Principal {
    static Cliente cliente = new Cliente("teste", "rua da paz",11);
    static Conta conta = new Conta(1, 200, 300, cliente);
    static Scanner teclado = new Scanner(System.in);


    public static void depositar() {
        System.out.println("======depósito=====");
        System.out.println("Informe o valor para o depósito: ");
        float valor = teclado.nextFloat();
        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso");
        } else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    public static void sacar() {
        System.out.println("Saque");
        System.out.println("informe o valor para saque:");
        float valor = teclado.nextFloat();
        if (valor > 0) {
            conta.sacar(valor);
        } else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    public static void consultar() {
        System.out.println("saldo é: " + conta.getSaldo());
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Bem vindo ao banco geek");

        do {
            System.out.println("Selecione uma opção abaxio:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("OPção invalida");
                    break;
            }

        } while (opcao > 0);
        teclado.close();
    }
}
