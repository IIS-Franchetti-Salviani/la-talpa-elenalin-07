/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author zxt02
 */
public class Gestore{
    private ArrayList<Buca> buche;
    private Talpa talpa;
    private Giocatore giocatore;
    private volatile boolean gioco = true;

    public Gestore(ArrayList<Buca> buche) {
        this.buche = buche;
        this.talpa = new Talpa(buche.size());
        this.giocatore = new Giocatore();
    }

    public boolean getGioco() {
        return gioco;
    }

    public void termina() {
        gioco = false;
        talpa.termina();
    }

    public void start(){
        talpa.start();
    }
    
    public int getPosizione(){
        return talpa.getPosizione();
    }
    
    public boolean controllaClick(int posizione) {
        if (posizione == talpa.getPosizione()) {
            giocatore.aumentaPunteggio();
            return true;
        }
        return false;
    }
    
    public void setTime(int t){
        talpa.setTime(t);
    }

    public int getPunteggio() {
        return giocatore.getPunteggio();
    }
}