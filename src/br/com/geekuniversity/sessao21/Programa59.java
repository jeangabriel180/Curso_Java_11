package br.com.geekuniversity.sessao21;

public class Programa59 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Angelina");
        System.out.println(lista);
        lista.adiciona("Maria");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista.contem("Angelina"));



    }

}
