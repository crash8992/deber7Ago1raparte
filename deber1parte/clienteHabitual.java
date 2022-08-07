package com.utpltec;

public class clienteHabitual extends cliente {

    private String diaVisita;
    private int horasPagadas;
    
    //constructores de la clase
    public clienteHabitual(String diaVisita, int horasPagadas) {
        this.diaVisita = diaVisita;
        this.horasPagadas = horasPagadas;
    }
    
    public clienteHabitual(String nombreCliente, int edadClient, int horasJugadas, String juegoFavorito, double puntaje,
            String diaVisita, int horasPagadas) {
        super(nombreCliente, edadClient, horasJugadas, juegoFavorito, puntaje);
        this.diaVisita = diaVisita;
        this.horasPagadas = horasPagadas;
    }




    //metodos de la clase
    public String getDiaVisita() {
        return diaVisita;
    }
    public void setDiaVisita(String diaVisita) {
        this.diaVisita = diaVisita;
    }
    public int getHorasPagadas() {
        return horasPagadas;
    }
    public void setHorasPagadas(int horasPagadas) {
        this.horasPagadas = horasPagadas;
    }

    
}
