package ejerciciosActividad3;

import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar: ");
        System.out.println("Ingrese el número de la tabla que necesita: ");
        Scanner obtN =  new Scanner (System.in);
        int numero = obtN.nextInt();
        int tabla =0;
        
        while(tabla<10){
            tabla+=1;
            System.out.println(tabla+" X "+numero+" = "+(tabla*numero));
        }
    }
            
}
