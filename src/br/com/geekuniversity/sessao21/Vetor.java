package br.com.geekuniversity.sessao21;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(int posicao, Aluno aluno) {
        for (int i = total - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i];
        }

    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        this.alunos[posicao] = null;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < total; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.total;
    }

    @Override
    public String toString() {
        //facilita a visuzalição do array
        return Arrays.toString(this.alunos);
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }
}
