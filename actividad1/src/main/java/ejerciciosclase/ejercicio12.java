package ejerciciosclase;

public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Numeros impares del 2 al 100: ");
        int numero = 1;
        for (int contador=1;contador<99;contador+=2){
            numero+=2;
            System.out.println(numero);
        }
    }
}
