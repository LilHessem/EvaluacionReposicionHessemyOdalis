package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        Banco banco = new Banco();
        do {
        System.out.println("------------------------------");
        System.out.println("BANCO AGRICOLA");
        System.out.println("------------------------------");
        System.out.println("Opcion 1: Cliente normal");
        System.out.println("Opcion 2: Cliente preferencial");
        System.out.println("Opcion 3: Atender siguiente cliente");
        System.out.println("Opcion 4: Cerrar programa");
        System.out.println("------------------------------");

            System.out.println("Ingresa una opcion: ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String clienteNormal = scan.nextLine();
                    banco.agregarClienteNormal(clienteNormal);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String clienteVIP = scan.nextLine();
                    banco.agregarClienteVIP(clienteVIP);
                    break;

                case 3:
                    banco.atenderSiguienteCliente();
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }

        }while (opcion != 4);


    }
}