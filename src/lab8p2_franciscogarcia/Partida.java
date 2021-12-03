package lab8p2_franciscogarcia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Partida implements Serializable{
    
    private String nombre;
    private Date creacion;
    private ArrayList<Estrella> estrellas = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList();
    
    private static final long SerialVersionUIDD = 444L;

    public Partida() {
    }

    public Partida(String nombre, Date creacion) {
        this.nombre = nombre;
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
