/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones.Factory;

/**
 *
 * @author cralducinr
 */
public class Principal {
    public static void main(String[] args) {
        Creator cr ;
        cr = new ConcreteCreator();
        Product producto = cr.factoryMethod();
        producto.operacion();
        
    }
}
