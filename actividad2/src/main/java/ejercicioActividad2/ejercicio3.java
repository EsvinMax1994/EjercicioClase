package ejercicioActividad2;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números diferentes: ");
        Scanner obtN = new Scanner (System.in);
        int n1 = obtN.nextInt();
        int n2 = obtN.nextInt();
        
        if(n1 != n2){
            if(n1>n2){
                System.out.println(n1);
                System.out.println(n2);
            }else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }else{
            System.out.println("Los números ingresados son iguales.");
        }
    }
}
