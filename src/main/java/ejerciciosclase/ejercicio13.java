package ejerciciosclase;

import java.util.Scanner;


public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de tabla de multiplicar que nesecite: ");
        Scanner obtenerNumero = new Scanner (System.in);
        int numero = obtenerNumero.nextInt();
        
        for(int i = 1; i <= 12; i++){
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
        
    }
}
