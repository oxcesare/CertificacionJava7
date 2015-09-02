/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author cralducinr
 */
public class Principal extends Thread {

    public static void main(String[] args) {
        int z = 0;
        while (z < 5) {
            Thread e = new Thread(new Runnable() {
                @Override
                public void run() {
                    int x = 10;
                    while (x < 15) {
                        mensajeA("Metodo");
                        x++;
                    }
                }
            });
            e.start();
            System.out.println("Nombre del Hilo Creado" + e.getName());
            z++;
        }
    }
    public static void mensajeA(String algo) {
        System.out.println("Mensaje Hilo A" + algo);
    }
    public static void mensajeB(String otro) {
        System.out.println("Mensaje Hilo B" + otro);
    }
}
