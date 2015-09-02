/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHilo1;

/**
 *
 * @author cralducinr
 */
public class Extender extends Thread {

    public Extender() {
    }

    public Extender(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        System.out.print("|Extender|");
    }
}
