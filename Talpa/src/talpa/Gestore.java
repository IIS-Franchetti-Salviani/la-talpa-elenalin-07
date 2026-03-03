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
public class Gestore extends Thread{
    private ArrayList<Buca> buche;
    private Talpa talpa;
    
    public Gestore(ArrayList<Buca> buche){
        this.buche = buche;
    }
}