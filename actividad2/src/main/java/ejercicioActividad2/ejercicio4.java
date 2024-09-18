package ejercicioActividad2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 números diferentes: ");
        Scanner obtN = new Scanner (System.in);
        int n1 = obtN.nextInt();
        int n2 = obtN.nextInt();
        int n3 = obtN.nextInt();
        
        if(n1 != n2 && n1 != n3 && n2 != n3){
            if(n1>n2 && n2>=n3){
                System.out.println(n1 + "" +'\n'+ "" + n2 + "" + '\n' + "" + n3);
            }else if(n2>n1 && n1>=n3){
                System.out.println(n2 + "" +'\n'+ "" + n1 + "" + '\n' + "" + n3);                
            }else if(n3>n1 && n1>=n2){
                System.out.println(n3 + "" +'\n'+ "" + n1 + "" + '\n' + "" + n2);
            }else if(n2>n3 && n3>=n1){
                System.out.println(n2 + "" +'\n'+ "" + n3 + "" + '\n' + "" + n1);
            }else if(n3>n2 && n2>=n1){
                System.out.println(n3 + "" +'\n'+ "" + n2 + "" + '\n' + "" + n1);
            }else if(n1>n3 && n3>=n2){
                System.out.println(n1 + "" +'\n'+ "" + n3 + "" + '\n' + "" + n2);
            }
        }else{
            System.out.println("Los números ingresados son iguales.");
        }
    }
}
