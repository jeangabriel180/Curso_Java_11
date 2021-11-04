package br.com.geekuniversity.sessao21;

public class Programa55 {
    public static void main(String[] args) {
        Aluno al1 = new Aluno("yasuo");
        Aluno al2 = new Aluno("zedao");

        Vetor lista = new Vetor();

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(al1);

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(al2);

        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(al1));

        try {
            System.out.println(lista.pega(2000));
        } catch (IllegalArgumentException e) {
            System.out.println("O ALUNO DESSA POSICAO NN EXISTE");
            System.out.println(e.getMessage());
        }
    }
}
