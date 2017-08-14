package br.pro.ramon.conta;

public class Conta {

    private double saldo;

    public Conta() {
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor < 0 || saldo - valor < 0) {
            throw new IllegalArgumentException();
        }

        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException();
        }

        saldo += valor;
    }

}
