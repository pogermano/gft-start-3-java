package com.w3g.entities;

public abstract class Conta implements  IConta {
    private int agencia;
    private int numero;
    private int saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void tranferir(Conta contaDestino, double valor) {

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }



}
