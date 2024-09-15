package ejerciciosclase;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero: ");
        Scanner obtener = new Scanner(System.in);
        int numero1 = obtener.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Scanner obtener2 = new Scanner(System.in);
        int numero2 = obtener2.nextInt();
        System.out.println("Primer numero ingresado: "+numero1+ '\n' +"Segundo numero ingresado: "+numero2);
    }
    
}
