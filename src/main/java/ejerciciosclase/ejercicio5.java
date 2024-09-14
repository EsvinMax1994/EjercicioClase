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
public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio de la Circunferencia: ");
        Scanner obtener = new Scanner (System.in);
        int radioC = obtener.nextInt();
        System.out.println("Radio ingresado: "+radioC+'\n'+"La Longitud de la circunferencia es: "+(2*Math.PI*radioC)+'\n'+"El Area de la circunferencia es: "+(Math.PI*(radioC*radioC)));         
    }
}
