/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;


import java.util.*;
import java.text.*;


/**
 *
 * @author cralducinr
 */
public class FractionDigits {

    public static void main(String[] args) throws ParseException {
        String[] numbers = {"1.222", "0.12345F"};
        double[] doubles = {1.222, 0.12345F};
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("Using format method: ");
        for (double val : doubles) {
            System.out.println(numberFormat.format(val));
        }
        System.out.println("Using parse method: ");
        for (String number : numbers) {
            System.out.println(numberFormat.parse(number));
        }
    }
}
