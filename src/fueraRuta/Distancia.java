/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueraRuta;

/**
 *
 * @author cralducinr
 */
public class Distancia {
    
    
    
    public static void main(String[] args) {
        Distancia c = new Distancia();
        c.calcularDistanciaEntreDosPuntos(18.830387, -98.2961065,  19.0391516666667, -98.211495);
        double distancia = c.calcularDistanciaEntreDosPuntos(18.830387, -98.2961065,  19.0391516666667, -98.211495);
        System.out.println("Distancia" +  distancia);
        
        if(distancia >1000){
            System.out.println("Fuera de Ruta");
        }
    }
    
    public  double calcularDistanciaEntreDosPuntos(double lat1, double lng1,
			double lat2, double lng2) {
		double earthRadius = 6371; // Radio de la tierra en kilometros
		lat1 = Math.toRadians(lat1);
		lng1 = Math.toRadians(lng1);
		lat2 = Math.toRadians(lat2);
		lng2 = Math.toRadians(lng2);
		double dLon = (lng2 - lng1);
		double dLat = (lat2 - lat1);
		double sinlat = Math.sin(dLat / 2);
		double sinlon = Math.sin(dLon / 2);
		double a = (sinlat * sinlat) + Math.cos(lat1) * Math.cos(lat2)
				* (sinlon * sinlon);
		double c = 2 * Math.asin(Math.min(1.0, Math.sqrt(a)));
		double distancia = earthRadius * c * 1000;

		return distancia;
	}
}
