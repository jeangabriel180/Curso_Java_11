package br.com.geekuniversity.sessao20;

public class Programa52 {
    public static void main(String[] args) {
        BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
        GeraRelatorio geraRelatorio = new GeraRelatorio();

        Thread t1 = new Thread(barraDeProgresso);
        t1.start();

        Thread t2 = new Thread(geraRelatorio);
        t2.start();
    }
}
