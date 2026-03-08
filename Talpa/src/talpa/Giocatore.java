/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

/**
 *
 * @author zxt02
 */
public class Giocatore {
    private int punteggio;
    
    public Giocatore(){
        punteggio = 0;
    }
    public void aumentaPunteggio() {
        punteggio++;
    }

    public int getPunteggio() {
        return punteggio;
    }
}
