/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneristoranteBar;


/**
 * @author chahir
 */
public class Tavolo {
    List list;
    private int numeroTavolo, numeroPersone;
    private String vis;

    public Tavolo(int numeroTavolo, int numeroPersone) {
        this.numeroTavolo = numeroTavolo;
        this.numeroPersone = numeroPersone;
        list = new List();
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }


    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public String VisualizzaTavolo() {
        return "Tavolo numero :" + "\t" + numeroTavolo + "\n" + "Numero Persone" + "\t" + numeroPersone + "\n" + list.index();
    }


}
