/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author cralducinr
 */
public class FractionDigits {

    public static void main(String[] args) {
        String[] numbers = {"1.222", "0.456789F"};
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        for (String number : numbers) {
            try {
                System.out.println(numberFormat.parse(number));
            } catch (ParseException pe) {
                System.out.println("Failed parsing " + number);
            }
        }
    }
}
