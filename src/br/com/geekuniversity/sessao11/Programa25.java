package br.com.geekuniversity.sessao11;

public class Programa25 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("yasuo", "ionia",11);
        Cliente c2 = new Cliente("teemo", "ionia",11);

        Conta cc1 = new Conta(1, 100.0f, 200.0f, c1);
        Conta cc2 = new Conta(2, 300.0f, 500.0f, c2);

        System.out.println("Saldo jao antes do saque:  " + cc1.getSaldo());
        cc1.sacar(300);
        System.out.println("Saldo jao:  " + cc1.getSaldo());

        //cc1.getSaldo() = -90000;


    }
}
