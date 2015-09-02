/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.io.Serializable;

/**
 *
 * @author cralducinr
 */
class ClassA<U> implements Comparable<U> {

    public int compareTo(U a) {
        return 0;
    }
}

class ClassB<U, V> extends ClassA<U> {
}
class ClassC<U, V> extends ClassA<U> {
}
class ClassE<U> extends ClassA<Comparable<Number>> {
}
class ClassF<U extends Comparable<U> & Serializable> extends ClassA<Number> {
}
