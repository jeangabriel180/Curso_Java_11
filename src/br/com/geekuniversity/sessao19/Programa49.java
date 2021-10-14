package br.com.geekuniversity.sessao19;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

import java.util.HashMap;
import java.util.Map;

public class Programa49 {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();
        Cliente cl1 = new Cliente("Teste", "Rua 1", 11);
        Cliente cl2 = new Cliente("Teste2", "Rua 2", 12);
        Conta c1 = new Conta(1, 200, 300, cl1);
        Conta c2 = new Conta(1, 400, 700, cl2);
        contas.put("Pessoa Fisica", c1);
        contas.put("Pessoa Juridica", c2);

        System.out.println(contas.get("Pessoa Fisica"));
    }
}
