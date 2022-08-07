package com.utpltec;

/**
 * Hello world!
 *
 */
public class cliente {

private String nombreCliente;
private int edadClient;
private int horasJugadas;
private String juegoFavorito;
private double puntaje;

//constructores
public cliente() {
}



public cliente(String nombreCliente, int edadClient, int horasJugadas, String juegoFavorito, double puntaje) {
    this.nombreCliente = nombreCliente;
    this.edadClient = edadClient;
    this.horasJugadas = horasJugadas;
    this.juegoFavorito = juegoFavorito;
    this.puntaje = puntaje;
}


//metodos ingresados

public String getNombreCliente() {
    return nombreCliente;
}

public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
}

public int getEdadClient() {
    return edadClient;
}

public void setEdadClient(int edadClient) {
    this.edadClient = edadClient;
}

public double getHorasJugadas() {
    return horasJugadas;
}

public void setHorasJugadas(int horasJugadas) {
    this.horasJugadas = horasJugadas;
}

public String getJuegoFavorito() {
    return juegoFavorito;
}

public void setJuegoFavorito(String juegoFavorito) {
    this.juegoFavorito = juegoFavorito;
}




public void parametrosCliente(){
    System.out.println("Datos Cliente:" + " " + "NOMBRE:" + this.nombreCliente + " " + "edad" + " " + this.edadClient + " " + "horas" + " " + this.horasJugadas );

}

public void datosJuegoCliente(){
    System.out.println("PREFENCIAS Client:" + " " + this.nombreCliente + " " + this.juegoFavorito );
}



public double getPuntaje() {
    return puntaje;
}

public void scoreCliente(){
    System.out.println("La Puntación por juego es:" + "nombre:" + " " + this.nombreCliente + " " + " juegoFAVOrito:" + " " + this.juegoFavorito + " " + "puntaje es:" + this.puntaje);
}


public void setPuntaje(double puntaje) {
    this.puntaje = puntaje;
}










}

 














