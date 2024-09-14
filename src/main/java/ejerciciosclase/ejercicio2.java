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
public class ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner obtener = new Scanner (System.in);
        String nombre = obtener.nextLine();
        System.out.println("Buenos dias "+nombre+"!");
    }
}
