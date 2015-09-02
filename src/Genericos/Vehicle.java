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
class Vehicle {
}

class Car extends Vehicle {
}

class Sedan extends Car {
}

//Wildcard en Java para aceptar genericos en una clase
class Garage<V> {
private V v;
public V get() { return this.v; }
public void put(V v) { this.v = v; }
}

