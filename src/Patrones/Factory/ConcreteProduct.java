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
public class ConcreteProduct implements Product{

    @Override
    public void operacion() {
        System.out.println("Invocando al método operacion de la clase concreta operacion");
    
        String la="18.99";
        String longi="18.99";
        
        String URL=""+la+longi;
    
    }
    
    
}
