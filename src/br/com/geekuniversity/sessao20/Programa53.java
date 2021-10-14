package br.com.geekuniversity.sessao20;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

public class Programa53 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("testse", "teste", 11);
        Conta c1 = new Conta(1, 200, 300, cli1);

        FazDeposito fazDeposito = new FazDeposito(c1);
        Thread t1 = new Thread(fazDeposito);
        Thread t2 = new Thread(fazDeposito);

        t1.start();
        t2.start();

        System.out.println(c1);
    }
}
