/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import org.apache.bcel.classfile.InnerClass;

/**
 *
 * @author cralducinr
 * 
 * Puedes crear el número de clases internas que necesites.
 */
public class InnerClassTest {
    public void foo() {
	        System.out.println("Outer class");
	}
	
	public class ReallyInner {
	    public void foo() {
	        System.out.println("Inner class");
	    }
	
	    public void test() {
	        this.foo();
	        InnerClassTest.this.foo();
	    }
	}
	
        public class ReallyInner2 {
	    public void foo() {
	        System.out.println("Inner class second");
	    }
	
	    public void test() {
	        this.foo();
	        InnerClassTest.this.foo();
	    }
	}
	public static void main(String[] args) {        
	        InnerClassTest.ReallyInner i = new InnerClassTest().new ReallyInner();
                
                InnerClassTest.ReallyInner2 j = new InnerClassTest().new ReallyInner2();
                j.test();
	        i.test();
	}
}
