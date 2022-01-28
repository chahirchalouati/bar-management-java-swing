/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneristoranteBar;


import java.io.*;
import java.util.Scanner;

/**
 * @author chahir
 */
public class FileClass {

    private String nomeFile, testo;

    public FileClass() {

    }

    public String getNomeFile() {
        return nomeFile;
    }

    public void setNomeFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public void ScrivereCon_PrintWriter(String nomeFile, String testo)
            throws IOException {
        FileWriter fileWriter = new FileWriter(nomeFile, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(testo);
        printWriter.close();
    }

    public boolean filereader(String nomeFile, String testo) throws FileNotFoundException {

        boolean trovato = false;

        File f = new File(nomeFile);

        Scanner input = new Scanner(f);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals(testo)) {
                trovato = true;
                // System.out.println(line+trovato);        
                break;
            } else {
                trovato = false;
                //  System.out.println(line+trovato);
            }

        }
        input.close();
        return trovato;
    }

    public String LeggiFile(String nomeFile) throws FileNotFoundException {
        StringBuilder text;
        File f = new File(nomeFile);
        Scanner sc = new Scanner(f);
        text = new StringBuilder(sc.nextLine() + "\n");
        while (sc.hasNextLine()) {
            text.append(sc.nextLine()).append("\n");
        }
        sc.close();
        return text.toString();
    }


}
