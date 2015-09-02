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
public class Worke extends Thread {

    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        Worke work = new Worke();
        work.start();
        work.run();
        work.start();
    }
}
