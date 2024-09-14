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
public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner obtener = new Scanner (System.in);
        int numero = obtener.nextInt();
        System.out.println("Numero ingresado es: "+numero+'\n'+"El doble del numero es: "+(int)(Math.pow(numero, 2))+'\n'+"El triple del numero es: "+(int)(Math.pow(numero, 3)));
    }
}
