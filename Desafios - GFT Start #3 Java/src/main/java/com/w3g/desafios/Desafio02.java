package com.w3g.desafios;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00",symbols);
        double V, D, R, area, altura;
        while (leitor.hasNext()) {
            V = leitor.nextDouble();
            D = leitor.nextDouble();
            R = D / 2;
            area = 3.14 *   Math.pow(R,2) ;
            altura = V / ( area  )   ;
            System.out.println("ALTURA = " + df.format(  altura       ));
            System.out.println("AREA = " + df.format(    area    ));
        }
    }

}