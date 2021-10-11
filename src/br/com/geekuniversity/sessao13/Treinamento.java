package br.com.geekuniversity.sessao13;

public abstract class Treinamento {

    //template method
    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico() {
        System.out.println("treino tatico");
    }
}
