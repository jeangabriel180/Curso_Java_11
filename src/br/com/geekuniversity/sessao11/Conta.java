package br.com.geekuniversity.sessao11;

import java.util.Objects;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("saque realizado com sucesso");
        } else if (valor <= (this.saldo + this.limite)) {
            float val_ret = this.saldo - valor;
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            this.saldo = 0;
            System.out.println("saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    /**
     * Método para realizar depósito
     *
     * @param valor a ser depositado
     */
    public synchronized void depositar(float valor) {
        this.saldo = this.saldo + valor;

        //syncronized(this){}
    }

    /**
     * Método do atributo saldo
     *
     * @return a soma do saldo + o limite
     */
    public float getSaldo() {
        return this.saldo + this.limite;
    }

    @Override
    public String toString() {
        return "O saldo da conta é:" + this.getSaldo();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Conta)) {
            return false;
        } else {
            Conta verificar = (Conta) o;
            return verificar.getSaldo() == this.getSaldo();
        }
    }
}
