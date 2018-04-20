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

public class Jornada {
	ArrayList <Partido> partido;
	private Integer codJornada;
	private Date fechaInicio;
	private Date fechaFin;
	Liga liga;

	public Jornada() {
	}

        public Jornada(ArrayList<Partido> partido, Integer codJornada, Date fechaInicio, Date fechaFin, Liga liga) {
            this.partido = partido;
            this.codJornada = codJornada;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.liga = liga;
        }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }

    public Integer getCodJornada() {
        return codJornada;
    }

    public void setCodJornada(Integer codJornada) {
        this.codJornada = codJornada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
        
	

}
