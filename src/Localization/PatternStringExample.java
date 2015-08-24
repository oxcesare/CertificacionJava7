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
 * @author cralducinr Se puede crear un patron como formato de salida de fecha
 *
 */
public class PatternStringExample {

    public static void main(String[] args) {
        String pattern = "dd-MM-yy"; /* d for day, M for month, y for year */

        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
// the default Date constructor initializes to current date/time
        System.out.println(formatter.format(new Date()));
    }
}
