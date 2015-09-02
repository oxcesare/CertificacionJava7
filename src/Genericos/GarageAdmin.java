/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

/**
 *
 * @author cralducinr
 */
public class GarageAdmin {

    private Object object = new Object();
    private Vehicle vehicle = new Vehicle();
    private Car car = new Car();
    private Sedan sedan = new Sedan();

    public void doD(Garage<? extends Car> g) {
        //g.put(object); // (1)
        //g.put(vehicle); // (2)
        //g.put(car); // (3)
        //g.put(sedan); // (4)
        object = g.get(); // (5)
        vehicle = g.get(); // (6)
        car = g.get(); // (7)
        // sedan = g.get(); // (8)
    }
}
