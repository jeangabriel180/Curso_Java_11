package br.com.geekuniversity.sessao18;

import java.util.Locale;

public class Programa41 {
    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";

        //replace na palavra
        curso = curso.replace("Java", "Python");
        curso = curso.toLowerCase();
        curso = curso.toUpperCase();

        System.out.println(curso);

        for (int i = curso.length() - 1; i > 0; i--) {
            System.out.println(curso.charAt(i));
        }

    }
}
