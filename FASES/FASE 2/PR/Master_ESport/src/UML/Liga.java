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

public class Liga {

	private String nombre;
	private Integer codLiga;
	Collection<Equipo> equipo;
	Collection<Jornada> jornada;

        public Liga() {
	}

        public Liga(String nombre, Integer codLiga, Collection<Equipo> equipo, Collection<Jornada> jornada) {
            this.nombre = nombre;
            this.codLiga = codLiga;
            this.equipo = equipo;
            this.jornada = jornada;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodLiga() {
        return codLiga;
    }

    public void setCodLiga(Integer codLiga) {
        this.codLiga = codLiga;
    }

    public Collection<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(Collection<Equipo> equipo) {
        this.equipo = equipo;
    }

    public Collection<Jornada> getJornada() {
        return jornada;
    }

    public void setJornada(Collection<Jornada> jornada) {
        this.jornada = jornada;
    }
        
        

}
