package br.com.geekuniversity.sessao20;

public class GeraRelatorio implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Gerando relatório.... aguarde");
        }
    }

    public void executa() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Gerando relatório.... aguarde");
        }
    }
}
