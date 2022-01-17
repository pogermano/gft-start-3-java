package com.w3g.exceptioncustomizada;

import java.io.*;

import javax.swing.JOptionPane;
public class ExceptionCustomizada1 {

    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou n�o, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line;
            line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }  catch (FalhaAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro n�o esperado, por favor fale com o suporte. "+e.getMessage());
            e.printStackTrace();
        }


    }

    private static BufferedReader lerArquivo(String nomeDoArquivo) throws FalhaAberturaArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new FalhaAberturaArquivoException( file.getName(), file.getPath());
        }
    }

}

class FalhaAberturaArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public FalhaAberturaArquivoException( String nomeDoArquivo, String diretorio) {
        super("O arquivo "+ nomeDoArquivo + " não foi encontrado no diretório "+ diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "FalhaAberturaArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}