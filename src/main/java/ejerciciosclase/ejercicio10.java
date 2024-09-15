package ejerciciosclase;

import java.util.Scanner;

public class ejercicio10 {
     public static void main(String[] args) {
        System.out.println("Ingrese tres numeros: ");
        Scanner obtenerNumero = new Scanner(System.in);
        int numero1 = obtenerNumero.nextInt();
        int numero2 = obtenerNumero.nextInt();
        int numero3 = obtenerNumero.nextInt();

        if(numero1 != numero2 && numero1 != numero3 && numero2 != numero3){
            if( numero1 > numero2 && numero1 < numero3 || numero1 < numero2 && numero1 > numero3){
                System.out.println("El numero del medio es: " + numero1);
            }else{
                if(numero2 > numero1 && numero2 < numero3 || numero2 < numero1 && numero2 > numero3){
                    System.out.println("El numero del medio es: " + numero2);
                }else{
                    if(numero3 > numero1 && numero3 < numero2 || numero3 < numero1 && numero3 > numero2){
                        System.out.println("El numero del medio es: " + numero3);
                    }
                }
            }
            
        }else{
            System.out.println("Los numeros deben ser diferentes!");
        }
    }         
}
