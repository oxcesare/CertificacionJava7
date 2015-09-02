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
public class Implementer implements Runnable {

    public void run() {
        System.out.print("|Implementer|");
    }

    public static void main(String[] args) {
        new Extender(new Implementer()).start(); // (1)
        new Extender().start(); // (2)
        new Thread(new Implementer()).start(); // (3)
    }
}
