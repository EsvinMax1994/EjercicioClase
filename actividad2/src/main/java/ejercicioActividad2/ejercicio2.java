
package ejercicioActividad2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        Scanner obtN = new Scanner (System.in);
        
        if(obtN.nextInt()>0){
            System.out.println("El número ingresado es positivo");
        }else{
            System.out.println("El número ingresado es negativo");
        }
    }
}
