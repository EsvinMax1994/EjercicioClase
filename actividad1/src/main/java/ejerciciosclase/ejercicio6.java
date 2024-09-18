package ejerciciosclase;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad: ");
        Scanner obtener = new Scanner (System.in);
        int edad = obtener.nextInt();
        
        if(edad>=18){
            System.out.println("MAYOR DE EDAD");
        }else{
            System.out.println("MENOR DE EDAD");
        }
    }
}
