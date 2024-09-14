/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author Maximus
 */
public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese los grados Centigrados: ");
        Scanner obtener = new Scanner (System.in);
        int gradosC = obtener.nextInt();
        int gradosF = 32+(9*gradosC/5);
        System.out.println("Grados Centigrados : " + gradosC + '\n'+ "Los grados en Fahrenheit serian: "+gradosF );
    }
}
