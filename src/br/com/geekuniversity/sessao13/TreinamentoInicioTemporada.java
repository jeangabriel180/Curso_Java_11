package br.com.geekuniversity.sessao13;

public class TreinamentoInicioTemporada extends Treinamento {
    @Override
    public void preparoFisico() {
        System.out.println("Preparo de inicio de temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo de treino de iniicio de temporada");
    }
}
