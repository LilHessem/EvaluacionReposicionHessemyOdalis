package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Banco {

    //En este caso utilizamos Deque porque este nos permite ingresar datos al inicio y al final de la fila, al igual que eliminarlos
    public Deque<String> fila;

    public Banco(){
        fila = new ArrayDeque<>();
    }

    public void agregarClienteNormal(String nombre){
        fila.addLast(nombre);
        System.out.println("El cliente normal agregado");
    }

    public void agregarClienteVIP(String nombre){
        fila.addFirst(nombre);
        System.out.println("El cliente VIP agregado");
    }

    public void atenderSiguienteCliente(){
        if (fila.isEmpty()){
            System.out.println("No hay clientes en la fila.");
        }else {
            String cliente = fila.removeFirst();
            System.out.println("Se ha atendido a: " + cliente);
        }
    }
}
