/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores;

/**
 *
 * @author cralducinr
 */
public class A {
    
    protected int i=0;
    
    public void setValor(int i){
        i=2;
    }
    
    public int getValor(){
        return i;
    }
}

class B extends A{

    public static void main(String[] args) {
        B b = new B();
        b.setValor(1);
        System.out.println("Valor"+b);
    }
}