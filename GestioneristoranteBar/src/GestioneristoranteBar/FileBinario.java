/*
Qua ho un problema nella lettura del file binario ,il metodo read UTF-8 legge solo la prima linea nel file 
ho provato diversi modi di lettura e se me lo legge tutto il file mi restituisce delle linea con dei simboli ,che credo che siano 
simboli del spazio che crea nella lettura tra un inserimento dei nuovi dati e i altrie gia esistenti 
per leggerlo tutto avevo usato un loop "while"e un loop for 


 */
package GestioneristoranteBar;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileBinario {

    private String s, nomefile;

    public FileBinario() {
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getNomefile() {
        return nomefile;
    }

    public void setNomefile(String nomefile) {
        this.nomefile = nomefile;
    }

    public void CreareFileBinario(String nomefile, String s) {
        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nomefile, true));
            oos.writeUTF(s);

            oos.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "file non trovato ?");

        }

    }

    public void LeggereFileBinario(String nomefile) throws IOException {


        ObjectInputStream ois = null;
        String str = "";
        ois = new ObjectInputStream(new FileInputStream(nomefile));
        try {

            while (true) {
                str = ois.readUTF();
                System.out.println(str);

            }
        } catch (EOFException e) {
        }
        ois.close();

    }

    public String leggereFile(String nomefile) {

        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(nomefile), StandardCharsets.UTF_8));

            while (bf.read() != -1) {
                s += bf.readLine();
                System.out.println(bf.read());

            }
            bf.close();

        } catch (IOException e) {
        }

        return s;

    }

}

/* public void SrivereBinFile(String nomefile, String s, String pass) {

        try {
            ObjectOutputStream oos = null;
            FileOutputStream f1 = new FileOutputStream(nomefile, true);
            oos = new ObjectOutputStream(f1);
            oos.writeUTF(s);
            oos.writeUTF(pass);
            oos.close();

        } catch (IOException e) {
        }
    }

    public String leggereFile(String nomefile) {

        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(nomefile), "UTF8"));

            s = bf.readLine();
            while(bf.read()!=-1){
             s += bf.readLine();
            System.out.println(String.valueOf(bf.read()));
            
            }
            bf.close();

        } catch (IOException e) {
        }

        return s;

    }

    public void leggiFile(String nomefile) throws IOException {

        try {
            FileInputStream fs = new FileInputStream(nomefile);
            InputStreamReader isr = new InputStreamReader(fs);
            BufferedReader bf = new BufferedReader(isr);

            s = bf.readLine();
            while(bf.read()!=-1){
             s += bf.readLine();
          
            
            }
          
            
            
            bf.close();
            isr.close();
            fs.close();
            System.out.println(s+"\t");  
        } catch (FileNotFoundException e) {
        }

      //  return s;
    }


 */
