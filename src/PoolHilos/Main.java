/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolHilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author cralducinr
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            //Va creando un nuevo hilo 
            exec.execute(new Runnable() {
                public void run() {
                    System.out.println("Running" + Thread.currentThread());
                    mensaje();
                }
            });
        }
        exec.shutdown();
        try {
            //bloquear hasta los hilos hayan terminado de completarse
            boolean b = exec.awaitTermination(50, TimeUnit.SECONDS);
            System.out.println("All: " + b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mensaje() {
        System.out.println("Crear un mensaje como actividad externa");
    }
}
