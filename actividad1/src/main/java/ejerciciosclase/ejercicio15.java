package ejerciciosclase;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Ingrese 10 numeros: ");
        Scanner obtenerNumero = new Scanner (System.in);
        int numeroMayor = Integer.MIN_VALUE;
        int numero;
        
        for(int i = 0; i<10; i++){
            numero = obtenerNumero.nextInt();
            if(numero>numeroMayor){
                numeroMayor=numero;
            }
        }
        System.out.println("El numero mayor es: "+numeroMayor);
}
}
