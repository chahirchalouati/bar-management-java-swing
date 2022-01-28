package GestioneristoranteBar;

import javax.swing.*;

public class PasswordLogin {

    private String nomeCognome;// string nome del utente
    private String password;//String password dove viene registrata la password//
    private boolean passValido;
    private String dati;


    public PasswordLogin(String password) {
        this.password = password;
    }


    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDati() {
        return dati;
    }

    public void setDati(String dati) {
        this.dati = dati;
    }

    // metodo di controllo password://
    public boolean PasswordValido() {
        //qua si controlla il numero dei chart inseriti se sono inferiori a 10 si apre in finestrina di errore 
        if (password.length() < 10) {
            JOptionPane.showMessageDialog(null, "password e inferiore a 10" + "\n" + "password contiene :" + "\n" + password.length() + "\n" + "Caratteri");
        }

        boolean maiuscula = false;// boolean per verfica maiuscula
        boolean minuscula = false;// boolean per verifica minuscla
        boolean inserimento = false;// boolean per  verifica del digit 

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) // verifica se ce una maiuscula//
            {
                maiuscula = true;
            }

            if (Character.isLowerCase(c)) // verifica se ce una minuscula//
            {
                minuscula = true;
            }
            if (Character.isDigit(c)) // verifica se ce un caratere digitato//
            {
                inserimento = true;
            }
        }

        if (!maiuscula) {
            //in caso viene inserito password senza lettera maiuscula//
            JOptionPane.showMessageDialog(null, "password deve contenere lettere maiuscule");
        }
        //in caso viene inserito password senza lettera minuscula//
        if (!minuscula) {
            JOptionPane.showMessageDialog(null, "password deve contenere lettere minuscule");
        }
        //in caso viene caso stringa vuota//
        if (!inserimento) {
            JOptionPane.showMessageDialog(null, "password Inavalida ");
        }

        if (maiuscula && minuscula && inserimento && password.length() >= 10) {
            passValido = true;
        } else {
            passValido = true;
        }

        return passValido;
    }


}
