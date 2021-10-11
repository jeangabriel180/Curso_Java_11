package br.com.geekuniversity.sessao13;

public class TreinamentoFimTemporada extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico fim da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino fim de temporada");
    }
}
