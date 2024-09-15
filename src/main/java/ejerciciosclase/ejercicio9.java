package ejerciciosclase;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese tres numeros para determinar el mayor :");
        Scanner obtenerNumero = new Scanner(System.in);
        int numero1 = obtenerNumero.nextInt();
        int numero2 = obtenerNumero.nextInt();
        int numero3 = obtenerNumero.nextInt();
        
        if(numero1 != numero2 && numero1 != numero3 && numero2 != numero3){
            if(numero1 > numero2){
                if(numero1 > numero3){
                    System.out.println("El numero mayor es: "+numero1);
                }else{
                    System.out.println("El numro mayor es: "+numero3);
                }
            }else{
                if(numero2 >numero3){
                    System.out.println("El numero mayor es: "+numero2);
                }else{
                    System.out.println("El numero mayor es: "+numero3);
                }
            }
        }else{
            System.out.println("Los Numeros deben de ser diferentes!");
        }
    }         
}
