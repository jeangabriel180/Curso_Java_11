package br.com.geekuniversity.sessao19;

import java.util.HashSet;
import java.util.Set;

public class Programa48 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        nomes.add("Maria");
        nomes.add("Felicity");
        nomes.add("Angelina");
        nomes.add("Geek");
        nomes.add("Felicity");

        //retorna true ou false caso consiga adicionar na lista
        System.out.println(nomes.add("yasuo"));

        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
