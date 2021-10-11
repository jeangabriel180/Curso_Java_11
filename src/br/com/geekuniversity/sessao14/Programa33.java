package br.com.geekuniversity.sessao14;

public class Programa33 {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();
        vent.desligar();
        vent.ligar();
        vent.desligar();
        System.out.println(vent.MARCA);
    }
}
