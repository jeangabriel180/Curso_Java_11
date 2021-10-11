package br.com.geekuniversity.sessao12;

public abstract class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "nome: " + this.nome + "Ano nascimento: " + this.ano_nascimento;
    }

    public abstract void outra_mensagem(String texto);
}
