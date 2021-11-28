package br.com.geekuniversity.sessao21;

import java.util.Stack;

public class Programa61 {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<>();

        System.out.println(nomes);
        nomes.push("Angelina"); // insere
        nomes.push("Felicity");
        System.out.println(nomes);

        String ret = nomes.peek(); // puxa o elemento do topo
        System.out.println(ret);

        String r1 = nomes.pop(); // remove
        System.out.println(r1);
        System.out.println(nomes);
    }
}
