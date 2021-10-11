package br.com.geekuniversity.sessao19;

import br.com.geekuniversity.sessao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class Programa47 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cli1 = new Cliente("Teste","teste",40);
        Cliente cli2 = new Cliente("Testee","testee",35);
        clientes.add(cli1);
        clientes.add(cli2);

        Collections.sort(clientes);

        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
}
