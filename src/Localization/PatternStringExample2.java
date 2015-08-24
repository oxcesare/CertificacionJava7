/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *
 * @author cralducinr
 */
public class PatternStringExample2 {
    public static void main(String[] args) {
        String pattern = "D";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
        Date today = new Date();
        System.out.println(formatter.format(today));

    }
}
