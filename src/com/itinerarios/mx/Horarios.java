/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itinerarios.mx;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cralducinr
 */
public class Horarios {
    
    
   //Definimos horarios 
    Date ahora = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
   
    
   //Definimos horarios reales
    
           final Date date = (Date)super.fromString(str);
           final Timestamp timestamp = new Timestamp(date.getTime());
           timestamp.setNanos(nanos);
           
           final Timestamp timestamp = (Timestamp)obj;
           String str = super.toString(new Date((timestamp.getTime() / 1000) * 1000));
    
    
    
    public static void main(String[] args) {
    
       
        
    }
    
     public boolean canConvert(Class type) {
           return type.equals(Timestamp.class);
     }
      
}
