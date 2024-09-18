package ejercicioActividad2;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner obtD = new Scanner(System.in);
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = obtD.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = obtD.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = obtD.nextInt();

        if(mes == 2){
            if( dia <=28 && anio > 0 ){
                System.out.println("Fecha de nacimiento: "+mes+"/"+dia+"/"+anio);
                System.out.println("Fecha de nacimiento correcta!");
            }
        }else if( mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if( dia <=30 && anio > 0 ){
                System.out.println("Fecha de nacimiento: "+mes+"/"+dia+"/"+anio);
                System.out.println("Fecha de nacimiento correcta!");
            }
        }else{
            if( dia <=31 && anio > 0 ){
                System.out.println("Fecha de nacimiento: "+mes+"/"+dia+"/"+anio);
                System.out.println("Fecha de nacimiento correcta!");
            }
        }
    }
}

