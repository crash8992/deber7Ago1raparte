package com.utpltec;

import java.util.ArrayList;
import java.util.Scanner;

public class testCliente {
    
public static void main(String[] args) {
    
ArrayList<cliente> coleccionCliente = new ArrayList<>();
cliente cliente1 = new cliente("Carlos A", 22, 3, "League of legends", 100.00);
cliente cliente2 = new clienteHabitual("JAvier H", 17, 6, "Dota 2", 836.63, "Jueves", 7);
cliente cliente3 = new clienteNuevo("Alex R", 19, 4, "LEagueOfLegends", 456.26, "Sábado", 4);
cliente cliente4 = new clienteSuscripcion("Daniel M", 21, 7, "LeagueOfLegends", 325.56, "sábado", 10, 0);

//agregar a la colección
coleccionCliente.add(cliente1);
coleccionCliente.add(cliente2);
coleccionCliente.add(cliente3);
coleccionCliente.add(cliente4);

for (int i = 0; i < coleccionCliente.size(); i++) {

    cliente cliente = coleccionCliente.get(i);
    cliente.parametrosCliente();
    
}

int opciones = 0;
while (opciones != 5) {
    
    System.out.println("1: Menu");
    System.out.println("2: Agregar Cliente NUevo");
    System.out.println("3: Mostrar todos los clientes, juego favorito y puntajes");
    System.out.println("4: Mostrar Clientes edad y horas jugadas");
    System.out.println("5: SALIR PROGRAMA");

    Scanner scan = new Scanner(System.in);
    opciones = scan.nextInt();


    if (opciones == 1) {
        System.out.println("MENU PRINCIPAL");
        
    }

    if (opciones == 2) {
        System.out.println("AGREGAR CLIENTE NUEVO");
        
        String nombreCliente = null;
        int edadCliente = 0;
        int horasJugadas = 0;
        String juegoFavorito = null;
        double puntajeDouble = 0;
        String diaVisita = null;
        int horasPagadas = 0;


        for (int i = 0; i < coleccionCliente.size(); i++) {
        System.out.println((i + 1) + "ingrese nombre");
        nombreCliente = scan.nextLine();
        System.out.println((i + 1) + " " + "ingrese edad");
        edadCliente = scan.nextInt();
        System.out.println((i + 1) + " " + "ingrese horas jugadas");
        horasJugadas = scan.nextInt();
        System.out.println((i + 1) + " " + "ingrese juego favorito");
        juegoFavorito = scan.next();
        System.out.println((i + 1) + " " + "ingrese puntaje");
        puntajeDouble = scan.nextDouble();
        System.out.println((i + 1) + " " + "ingrese Día Visita");
        diaVisita = scan.next();
        System.out.println((i + 1) + " " + "horasPagadas");
        horasPagadas = scan.nextInt();
        
    }

    }

    if (opciones == 3) {
        System.out.println("Mostrar todos los clientes y juego favorito");
        
        for (int i = 0; i < coleccionCliente.size(); i++) {
            cliente cliente = coleccionCliente.get(i);
            cliente.scoreCliente();

        }
        

    }

    if (opciones ==4) {
        System.out.println("Mostrar Clientes edad y horas jugadas");

        for (int i = 0; i < coleccionCliente.size(); i++) {
            cliente cliente = coleccionCliente.get(i);
            cliente.parametrosCliente();

        }

        
    }

    if (opciones ==5) {
        System.out.println("SALIDA PROGRAMA");


    }
}


}

}
