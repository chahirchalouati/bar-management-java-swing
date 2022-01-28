/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneristoranteBar;

/**
 * @author chahir
 */
public class Menu {

    private String menu;
    private double prezzo, totale;
    private int quantita;

    public Menu(String menu, double prezzo, int quantita) {
        this.menu = menu;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double totale() {

        totale = prezzo * quantita;
        return totale;
    }


    public String Pasto() {
        return "Pasto :" + "\t" + menu + "\n" + "Prezzo :" + "\t" + prezzo + "\n" + "quantita :" + "\t" + quantita + "\n";
    }


}
