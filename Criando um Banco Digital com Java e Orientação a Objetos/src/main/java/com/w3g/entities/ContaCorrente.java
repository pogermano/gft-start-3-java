package com.w3g.entities;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private int saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void sacar(){};
    public void depositar(){};
    public void tranferir(){};

}
