package br.com.geekuniversity.sessao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programa50 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(21, "teste1");
        pessoas.put(31, "teste2");
        pessoas.put(41, "teste3");

        //me retorna uma lista das pela chave
        // System.out.println(pessoas.keySet());

//        pessoas.keySet().forEach(idade -> {
//            System.out.println(pessoas.get(idade));
//        });

        System.out.println(pessoas.values());
        System.out.println(pessoas.entrySet());

        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(pessoas.get(idade));
        }

        Collection<String> valores = pessoas.values();
        for (String nome : valores) {
            System.out.println(nome);
        }

        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });

        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();

        for (Map.Entry<Integer, String> associao : associacoes) {
            System.out.println(associao.getKey() + " - " + associao.getValue());
        }

        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });
    }
}
