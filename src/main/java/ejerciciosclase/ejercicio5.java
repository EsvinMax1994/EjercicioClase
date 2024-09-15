package ejerciciosclase;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio de la Circunferencia: ");
        Scanner obtener = new Scanner (System.in);
        int radioC = obtener.nextInt();
        System.out.println("Radio ingresado: "+radioC+'\n'+"La Longitud de la circunferencia es: "+(2*Math.PI*radioC)+'\n'+"El Area de la circunferencia es: "+(Math.PI*(radioC*radioC)));         
    }
}
