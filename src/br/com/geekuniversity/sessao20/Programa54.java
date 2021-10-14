package br.com.geekuniversity.sessao20;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

public class Programa54 {
    public static void main(String[] args) throws InterruptedException {
        Cliente cli1 = new Cliente("testse", "teste", 11);
        Conta c1 = new Conta(1, 200, 300, cli1);

        FazDeposito fazDeposito = new FazDeposito(c1);
        Thread t1 = new Thread(fazDeposito);
        Thread t2 = new Thread(fazDeposito);

        t1.start();
        t2.start();

        t1.join(); // avisando qe a thread t1 deve se juntar a um sincronizador
        t2.join();

        System.out.println(c1);
    }
}
