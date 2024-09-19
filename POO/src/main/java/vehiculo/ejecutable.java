package vehiculo;

public class ejecutable {

    public static void main(String[] args) {

        //llamar el objeto y asignarle un valor a uno de sus atributos:
        /*vehiculo obj1 = new vehiculo();
        obj1.tipo = "terrestre";

        vehiculo obj2 = new vehiculo();
        obj2.tipo = "Aereo";*/
        
        
        /*vehiculo obj1 = new vehiculo();
        obj1.tipo = "terrestre";
        obj1.velocidad = 80;
        obj1.mostrarVelocidad();
        System.out.println(obj1.distancia(6));
        System.out.println(obj1.distancia(3));
        System.out.println(obj1.distancia(12));
        
        vehiculo.saludar("Esvin");
        System.out.println("Valor " + vehiculo.pi);*/

        /*vehiculo obj2 = new vehiculo();
        obj2.tipo = "Aereo";
        obj2.velocidad = 90;
        obj1.mostrarVelocidad();*/
        
        //constructor 
        vehiculo obj1 = new vehiculo("Terreste", "Honda", 1123, "123plx", "Rojo");
        System.out.println(obj1.placa);
    }
}
