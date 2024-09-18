
package ejerciciosclase;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros a promediar: ");
        Scanner obtenerDato = new Scanner (System.in);
        int cantidad = obtenerDato.nextInt();
        System.out.println("Ingrese los numeros: ");
        double promedio;
        int sumatoria=0;
        
        for(int i=0; i<cantidad; i++){
            int numero = obtenerDato.nextInt();
            sumatoria = numero+=sumatoria;
        }    
        promedio= sumatoria/cantidad;
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
}
