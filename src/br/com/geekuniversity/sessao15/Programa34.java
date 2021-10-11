package br.com.geekuniversity.sessao15;

public class Programa34 {
    public static void main(String[] args) {
        Conta c1 = new Conta("yasuo");

        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta( "yone");

        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        System.out.println(c1.contador);
        System.out.println(c2.contador);
        System.out.println(Conta.contador);

        System.out.println(Conta.proximaConta());
    }
}
