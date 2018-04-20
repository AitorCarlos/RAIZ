/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author 1GDAW03
 */
import java.util.*;

public class Equipo {

	private String nombre;
	private Integer codEquipo;
	ArrayList <Jugador> jugador;
	Duenno duenno;
	Liga liga;
	ArrayList <Partido> partido;

	public Equipo() {
	}

        public Equipo(String nombre, Integer codEquipo, ArrayList<Jugador> jugador, Duenno duenno, Liga liga, ArrayList<Partido> partido) {
            this.nombre = nombre;
            this.codEquipo = codEquipo;
            this.jugador = jugador;
            this.duenno = duenno;
            this.liga = liga;
            this.partido = partido;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(Integer codEquipo) {
        this.codEquipo = codEquipo;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public Duenno getDuenno() {
        return duenno;
    }

    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }

        

}
