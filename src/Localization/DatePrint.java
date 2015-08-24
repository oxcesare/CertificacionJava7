/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.util.*;
import java.text.*;


/**
 *
 * @author cralducinr
 * Con DateFormat podemos establecer diferentes formatos de fecchas para mostrar en Pantalla
 */
public class DatePrint {
 
    public static void main(String[] args) {
        Date today = new Date();
        Locale [] locales ={Locale.CANADA, Locale.CHINESE, Locale.FRANCE};
        for( Locale locale : locales){
            DateFormat dataFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("Date Local" + locale+  "is :" + dataFormat.format(today));
        }
    }
}
