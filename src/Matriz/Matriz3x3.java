/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import java.util.*;

/**
 *
 * @author cralducinr
 */
public class Matriz3x3 {

    public static void main(String[] args) {
        Matriz3x3 c = new Matriz3x3();
        main();
    }

    public static void main() {
        int i;
        int j;
        int matriza[][] = new int[3][3];

        Scanner dato = new Scanner(System.in);
        System.out.println("Escribir datos de la matriz ");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriza[i][j] = dato.nextInt();
            }
        }
        System.out.println("MATRIZ 3x3");
        for (i = 0; i <=2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matriza[i][j] + "");
            }
            System.out.println("");
        }
    }
}
