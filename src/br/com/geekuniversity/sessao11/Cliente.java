package br.com.geekuniversity.sessao11;

public class Cliente implements Comparable {
    String nome;
    String endereco;
    int idade;

    public Cliente(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object cliente) {
        Cliente aux = (Cliente) cliente;
        if (this.idade < aux.idade)
            return -1;
        else if (this.idade > aux.idade)
            return 1;
        else
            return 0;
    }
}
