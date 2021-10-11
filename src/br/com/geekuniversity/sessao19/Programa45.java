package br.com.geekuniversity.sessao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa45 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("MARIA");
        nomes.add("FELICITY");
        nomes.add("ANGELINA");
        nomes.add("GEEK");
        nomes.add("Naruto");
        //  nomes.add(44);

//        System.out.println(nomes.get(0));
//        System.out.println(nomes.get(3));
//        System.out.println(nomes.get(2));

        Collections.sort(nomes);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
