/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneristoranteBar;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author chahir
 */
public class List {

    LinkedList<Menu> listMenu;
    private String index;
    private double totale;

    public List() {
        listMenu = new LinkedList();
    }

    public LinkedList<Menu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(LinkedList<Menu> listMenu) {
        this.listMenu = listMenu;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }


    public void aggiungi(Menu mn) {
        listMenu.add(mn);

    }

    public int Size() {
        int size = listMenu.size();
        return size;
    }

    public String index() {
        for (Iterator<Menu> iterator = listMenu.iterator(); iterator.hasNext(); ) {
            index = iterator.next().Pasto();
            do {
                index += iterator.next().Pasto();

            } while (iterator.hasNext());

        }

        return index;
    }

    public double TotaleLista() {
        for (Iterator<Menu> iterator = listMenu.iterator(); iterator.hasNext(); ) {
            totale = iterator.next().totale();
            do {
                totale += iterator.next().totale();

            } while (iterator.hasNext());

        }

        return totale;
    }

    public void Cancella() {
        listMenu.clear();

    }


}




   


