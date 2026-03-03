/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author zxt02
 */
public class Talpa extends Thread{
    private volatile int posizione = -1;
    private volatile boolean attiva = true;
    private int maxBuche;

    public Talpa(int maxBuche) {
        this.maxBuche = maxBuche;
    }

    public int getPosizione() {
        return posizione;
    }

    public void termina() {
        attiva = false;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (attiva) {
            posizione = random.nextInt(maxBuche);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            posizione = -1; // 
        }
    }
}
