package br.com.geekuniversity.sessao21;

//lista ligada / linked list
public class Programa57 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Angelina");
        System.out.println(lista);
        lista.adiciona("Maria");
        lista.adiciona("Felicity");
        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);


    }
}
