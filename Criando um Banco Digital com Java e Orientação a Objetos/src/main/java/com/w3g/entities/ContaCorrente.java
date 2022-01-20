package com.w3g.entities;

public class ContaCorrente  extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("\n**** Estrato Conta Corrente ****\n");
        super.imprimirInfosComuns();
    }


}
