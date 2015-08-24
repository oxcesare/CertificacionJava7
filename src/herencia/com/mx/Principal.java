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
public class Principal  {  
    
    public static void main(String[] args) {
        
//       double lat1=36.902972881800785;
//       double lng1=30.709032118320465;
//       double lat2=36.90297073696292;
//       double lng2=30.709064304828644;
    
//       double lat1=18.8771729;
//       double lng1=-98.295419;
//       double lat2=19.044185;
//       double lng2=-98.2087583333333;
      
       double lat1=19.071895;
       double lng1=-98.193415;
    
       double lat2=18.8771729;
       double lng2=-98.2954198;
       
    
       Cuatro  c = new Cuatro();
       
       double distancia = c.calcularDistanciaEntreDosPuntos(lat1, lng1, lat2, lng2);
      
       System.out.println("Distancia en Km" + " "  +  distancia);
       
       //Dejando el radio para saber si esta fuera de ruta 
       double rango = 1000;
       
       if(distancia >=rango){
           System.out.println("La distancia es mayor a la establecida, Fuera de ruta");
       }else{
           System.out.println("Se Matiene dentro de la ruta");
       }
       
       
    }
}
