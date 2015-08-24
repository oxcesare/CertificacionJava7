/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.com.mx;

/**
 *
 * @author cralducinr
 */
public class Cuatro {

    public double calcularDistanciaEntreDosPuntos(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 6371; //Radio de la tierra en kilometros
        lat1 = Math.toRadians(lat1);
        lng1 = Math.toRadians(lng1);
        lat2 = Math.toRadians(lat2);
        lng2 = Math.toRadians(lng2);
        double dLon = (lng2 - lng1);
        double dLat = (lat2 - lat1);
        double sinlat = Math.sin(dLat / 2);
        double sinlon = Math.sin(dLon / 2);
        double a = (sinlat * sinlat) + Math.cos(lat1) * Math.cos(lat2) * (sinlon * sinlon);
        double c = 2 * Math.asin(Math.min(1.0, Math.sqrt(a)));
        double distancia = earthRadius * c * 1000;

        return distancia;
    }
}
