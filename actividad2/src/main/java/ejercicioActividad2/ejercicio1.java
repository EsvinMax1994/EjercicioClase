
package ejercicioActividad2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros: ");
        Scanner obtenerNumero = new Scanner (System.in);
        int numero1 = obtenerNumero.nextInt();
        int numero2 = obtenerNumero.nextInt();
        
        if(numero1 != numero2){
            System.out.println("Los numeros no son iguales.");
        }else{
            System.out.println("Los numeros son iguales.");
        }
    }
            
}
