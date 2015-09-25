/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;

/**
 *
 * @author cralducinr
 */
public class Confusing {

    private Confusing(Object o) {
        System.out.println("Object");
    }
   
    private Confusing(double [] Array) {
        System.out.println("Valor");
    }
    
    public static void main(String[] args) {
        new Confusing(null);
    }
       
}
