package ejerciciosclase;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para determinar si es positivo o negativo: ");
        Scanner obtenerNumero = new Scanner (System.in);
        int numero = obtenerNumero.nextInt();
        
        if(numero>0){
            System.out.println("Numero Positvo");
        }else{
            System.out.println("Numero Negativo");
        }
    }
}
