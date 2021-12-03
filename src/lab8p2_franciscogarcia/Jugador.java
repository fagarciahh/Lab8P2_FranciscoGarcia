package lab8p2_franciscogarcia;

import java.io.Serializable;

public class Jugador implements Serializable{
    
    private int velocidad;
    private String nombre;
    
    private static final long SerialVersionUIDD = 555L;

    public Jugador() {
    }

    public Jugador(int velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
