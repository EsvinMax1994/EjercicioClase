
package vehiculo;

public class vehiculo {
    String tipo;
    String marca;
    float velocidad;
    String placa;
    String color;
    static double pi = Math.PI;//atributo static
    
    //constructor
    
    public vehiculo(String tipo,String marca,float velocidad, String placa,String color ){
        this.tipo = tipo;
        this.marca = marca;
        this.velocidad = velocidad;
        this.placa = placa;
        this.color = color;
    }
    
    //metodo void
    public void mostrarVelocidad(){
        System.out.println("El vehiculo viaja a una velocidad de " + this.velocidad);
    }
    
    //v = d/t
    //v*t = d
    public float distancia(int tiempo){
        float resultado = this.velocidad*tiempo;
        return resultado;
    }
    
    //metodo estatico
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
}
