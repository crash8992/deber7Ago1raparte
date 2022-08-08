package com.utpltec;

public class clienteSuscripcion extends cliente {

private String diaVisita;
private int horasSuscrit;
private int horaAdicional;

//constructores de la clase
public clienteSuscripcion(String diaVisita, int horasSuscrit, int horaAdicional) {
    this.diaVisita = diaVisita;
    this.horasSuscrit = horasSuscrit;
    this.horaAdicional = horaAdicional;
}
public clienteSuscripcion(String nombreCliente, int edadClient, int horasJugadas, String juegoFavorito, double puntaje,
        String diaVisita, int horasSuscrit, int horaAdicional) {
    super(nombreCliente, edadClient, horasJugadas, juegoFavorito, puntaje);
    this.diaVisita = diaVisita;
    this.horasSuscrit = horasSuscrit;
    this.horaAdicional = horaAdicional;
}

//metodos de la clase
public String getDiaVisita() {
    return diaVisita;
}
public void setDiaVisita(String diaVisita) {
    this.diaVisita = diaVisita;
}
public int getHorasSuscrit() {
    return horasSuscrit;
}
public void setHorasSuscrit(int horasSuscrit) {
    this.horasSuscrit = horasSuscrit;
}
public int getHoraAdicional() {
    return horaAdicional;
}
public void setHoraAdicional(int horaAdicional) {
    this.horaAdicional = horaAdicional;
}

    
}
