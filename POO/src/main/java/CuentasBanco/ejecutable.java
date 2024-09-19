package CuentasBanco;

import java.util.Scanner;

public class ejecutable {

    public static void main(String[] args) {
        cuenta cuenta1 = new cuenta("Esvin", 500);
        cuenta cuenta2 = new cuenta("Max", 300);

        Scanner dato = new Scanner(System.in);
        int opcion;
        float monto;
        float saldo1 = cuenta1.saldo;
        float saldo2 = cuenta2.saldo;
        do {
            System.out.println("* Saldo de la cuenta No 1: " + saldo1);
            System.out.println("* Saldo de la cuenta No 2: " + saldo2);
            System.out.println("> 1. Abonar a la cuenta No.1");
            System.out.println("> 2. Abonar a la cuenta No.2");
            System.out.println("> 3. Debitar a la cuenta No.1");
            System.out.println("> 4. Debitar a la cuenta No.2");
            System.out.println("> 5. Consultar Saldos");
            System.out.println("> 6. Salir");

            opcion = dato.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println('\n' + "Bienvenido " + cuenta1.titular);
                    System.out.println("Ingrese la cantidad que desea abonar: ");
                    monto = dato.nextFloat();
                    saldo1 = cuenta1.abonar(monto);
                    System.out.println('\n' + cuenta1.titular + " su saldo actual es de: " + saldo1 + '\n');
                    break;
                case 2:
                    System.out.println('\n' + "Bienvenido " + cuenta2.titular);
                    System.out.println("Ingrese la cantidad que desea abonar: ");
                    monto = dato.nextFloat();
                    saldo2 = cuenta2.abonar(monto);
                    System.out.println('\n' + cuenta2.titular + " su saldo actual es de: " + saldo2 + '\n');
                    break;
                case 3:
                    System.out.println('\n' + "Bienvenido " + cuenta1.titular);
                    System.out.println("Ingrese la cantidad que desea debitar: ");
                    monto = dato.nextFloat();
                    if (monto <= saldo1) {
                        saldo1 -= monto;
                        System.out.println('\n' + cuenta1.titular + " su saldo actual es de: " + saldo1 + '\n');
                    } else {
                        System.out.println('\n' + cuenta1.titular + " su saldo actual es insuficiente para esta transaccion." + '\n');
                    }
                    break;
                case 4:
                    System.out.println('\n' + "Bienvenido " + cuenta2.titular);
                    System.out.println("Ingrese la cantidad que desea debitar: ");
                    monto = dato.nextFloat();
                    if (monto <= saldo2) {
                        saldo2 -= monto;
                        System.out.println('\n' + cuenta2.titular + " su saldo actual es de: " + saldo2 + '\n');
                    }else {
                        System.out.println('\n' + cuenta2.titular + " su saldo actual es insuficiente para esta transaccion." + '\n');
                    }
                    break;
                case 5:
                    System.out.println('\n' + cuenta1.titular + " su saldo actual es de: " + saldo1);
                    System.out.println(cuenta2.titular + " su saldo actual es de: " + saldo2 + '\n');
                    break;
                case 6:
                    System.out.println("Gracias por preferirnos vuelva pronto!");
                    break;
            }
        } while (opcion != 6);

    }
}
