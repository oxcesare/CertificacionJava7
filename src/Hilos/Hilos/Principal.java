/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos.Hilos;

import static Hilos.Principal.mensajeA;

/**
 *
 * @author cralducinr
 */
public class Principal implements Runnable {
    
    public static void main(String[] args) {
        
        Principal c = new Principal();
        c.other();
                
    }

    //Método que manda a llamr al run 
    public void other(){
        run();
    }
    
    public void run (){
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
    
}
