package com.w3g;


import com.w3g.entities.Cliente;
import com.w3g.entities.Conta;
import com.w3g.entities.ContaCorrente;
import com.w3g.entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro Osório Germano");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(100);
        cc.tranferir(50,poupanca);

        cc.imprimirEstrato();
        poupanca.imprimirEstrato();


    }
}
