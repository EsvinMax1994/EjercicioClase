package ejerciciosclase;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Ingrese un texto: ");
        Scanner obtenerTexto = new Scanner (System.in);
        String texto = obtenerTexto.nextLine();
        int totalVocales = 0;
        
        for(int i = 0; i<texto.length();i++){
            char c = texto.charAt(i);
            if((c == 'A') || (c == 'a') ||(c == 'E') || (c == 'e') ||(c == 'I') || (c == 'i')||(c == 'O') || (c == 'o')||(c == 'U') || (c == 'u')){
                totalVocales++;
            }
        }
        System.out.println("Total de vocales en el texto: " + totalVocales);         
    }
}
