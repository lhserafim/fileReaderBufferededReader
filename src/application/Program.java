package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String args[]) {
        String path = "/Users/lhserafim/Desktop/teste.txt";

        // VERSÃO OTIMIZADA
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // VERSÃO MANUAL PIOR!!
        /*
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // BufferedReader é uma abstração maior e lê os arquivos mais rapidamente

            String line = br.readLine();
            // Enquanto não voltar null, ler o arquivo
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            // Tem que fechar br e fr com try, pois pode dar erro no fechamento
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                System.out.println("Erro geral: " + e.getStackTrace());
            }
        }
        */

    }
}
