package com.w3g.entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("\n**** Estrato Conta Poupança ****\n");
        super.imprimirInfosComuns();
    }


}
