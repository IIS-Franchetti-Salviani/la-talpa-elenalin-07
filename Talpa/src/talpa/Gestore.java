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

    public Gestore(ArrayList<Buca> buche, Talpa talpa, Giocatore giocatore) {
        this.buche = buche;
        this.talpa = talpa;
        this.giocatore = giocatore;
    }

    public boolean getGioco() {
        return gioco;
    }

    public void termina() {
        gioco = false;
        talpa.termina();
    }

    public void controllaClick(int posizione) {
        if (posizione == talpa.getPosizione()) {
            giocatore.aumentaPunteggio();
        }
    }

    public int getPunteggio() {
        return giocatore.getPunteggio();
    }
}