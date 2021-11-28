package br.com.geekuniversity.sessao21;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        fila.add("Angelina");
        fila.add("Maria");
        fila.add("Felicity");

        System.out.println(fila);

        String ret = fila.remove();

        System.out.println(ret);
        System.out.println(fila);
    }
}
