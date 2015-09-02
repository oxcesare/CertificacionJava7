/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacionocjp7;

import java.util.*;

/**
 *
 * @author cralducinr
 */
public class C {

    public static void main(String[] args) {
        
        String d ="ABCDEFGHI";
       
        
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        
        Iterator<Integer> numsIter = c.iterator();
        
        System.out.println("Lista"+c);
        
        while (numsIter.hasNext()) {
            numsIter.next();
            numsIter.remove();
        }
        System.out.println("Lista 2"+c);
    }
}
