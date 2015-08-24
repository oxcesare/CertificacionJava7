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
 */
public class DateStyleFormats {

    public static void main(String[] args) {
        Date now = new Date();
        int[] dateStyleFormats = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG,
            DateFormat.FULL, DateFormat.DEFAULT};
        System.out.println("Today's date in different styles are: ");
        // print today's date in all four formats plus
        // the default format in the default Locale
        for (int dateStyleFormat : dateStyleFormats) {
            DateFormat dateFormat = DateFormat.getDateInstance(dateStyleFormat);
            System.out.println(dateFormat.format(now));
        }

    }
}
