package ejerciciosclase;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros para sumarlos: ");
        Scanner obtenerNumero = new Scanner (System.in);
        int numero1 = obtenerNumero.nextInt();
        int numero2 = obtenerNumero.nextInt();
        System.out.println("Numeros sumados: "+(numero1+numero2));
    }
            
}
