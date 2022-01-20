/*
* Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).




Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.


Exemplo de Entrada	Exemplo de Saída
S
1.0
0.0
-3.5
2.5
4.1
...

12.6
*
*
* */

package com.w3g;

import java.io.IOException;
import java.util.Scanner;

public class Desafio03 {
    static final  int LIN = 12;
    static final  int COL = 12;
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        double somaAcima = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[LIN][COL];
        int[][] mat = new int[LIN][COL];
        double dp = 0;
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < LIN; i++) {
            for (int j = i + 1; j < COL; j++) {

                somaAcima = somaAcima + M[i][j];
            }

        }


       if (O == 'M') {
            soma = somaAcima/66;
            System.out.println(String.format("%.1f", soma));
        } else if (O == 'S'){
            System.out.println(String.format("%.1f", somaAcima));}
    }

}

