/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itinerarios.mx;

/**
 *
 * @author cralducinr
 */
public class Horarios4 {
    public static void main(String[] args) {
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
        System.out.println("sql.Timestamp: " + sqlTimestamp);
    }

}
