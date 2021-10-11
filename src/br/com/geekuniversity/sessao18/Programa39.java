package br.com.geekuniversity.sessao18;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

public class Programa39 {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("yasuo", "1234",11);
        Cliente cli2 = new Cliente("sasuke", "1234",11);

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(1, 200, 300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1);
        System.out.println(c2);

        if (c1.equals(cli1)) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);

        prateleira.pegar(1);

        System.out.println(((Conta) prateleira.pegar(0)).getSaldo());
        System.out.println(((Conta) prateleira.pegar(1)).getSaldo());

        //adicionando cliente no mesmo array
        prateleira.adicionar(cli1);
        System.out.println(((Cliente) prateleira.pegar(2)).getNome());

    }
}
