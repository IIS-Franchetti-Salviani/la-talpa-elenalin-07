/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

import java.util.ArrayList;

/**
 *
 * @author zxt02
 */
public class Talpa extends Thread{
    private int punteggio;
    private ArrayList<Buca> buche;
    private volatile boolean stato;
    private int posizione = 0;
    
    public Talpa(ArrayList<Buca> buche) {
        this.buche = buche;
        stato = true;
    }
    
    public void setPosizione(int p){
        posizione = p;
    }
    
    public int geetPosizione(){
        return posizione;
    }
    
    public void termina(){
        stato = false;
    }
    
    public boolean getStato(){
        return stato;
    }
}
