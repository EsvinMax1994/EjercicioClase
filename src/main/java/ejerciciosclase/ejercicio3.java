package ejerciciosclase;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner obtener = new Scanner (System.in);
        int numero = obtener.nextInt();
        System.out.println("Numero ingresado es: "+numero+'\n'+"El doble del numero es: "+(int)(Math.pow(numero, 2))+'\n'+"El triple del numero es: "+(int)(Math.pow(numero, 3)));
    }
}
