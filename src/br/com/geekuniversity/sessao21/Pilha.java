package br.com.geekuniversity.sessao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome) {
        this.nomes.add(nome);
    }

    public String remove() {
        return nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo() {
        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia() {
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
