package br.com.geekuniversity.sessao21;

import java.util.LinkedList;
import java.util.List;

public class Programa58 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();
        System.out.println(lista.size());
        lista.add("Felicity");
        lista.add("Angeline");
        lista.add(0,"Maria");
        System.out.println(lista);
    }
}
