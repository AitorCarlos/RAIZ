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
import java.sql.Time;
import java.util.*;

public class Partido {
	private String resultado;
	Jornada jornada;
	private Date fecha;
	private boolean jugado;
	private Integer codPartido;
	private Time hora;
	ArrayList <Equipo> equipo;

	public Partido() {
	}

        public Partido(String resultado, Jornada jornada, Date fecha, boolean jugado, Integer codPartido, Time hora, ArrayList<Equipo> equipo) {
            this.resultado = resultado;
            this.jornada = jornada;
            this.fecha = fecha;
            this.jugado = jugado;
            this.codPartido = codPartido;
            this.hora = hora;
            this.equipo = equipo;
        }     

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Jornada getJornada() {
		return this.jornada;
	}

	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean getJugado() {
		return this.jugado;
	}

	public Integer getCodPartido() {
		return this.codPartido;
	}

	public void setCodPartido(Integer codPartido) {
		this.codPartido = codPartido;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public ArrayList<Equipo> getEquipo() {
            return equipo;
        }

        public void setEquipo(ArrayList<Equipo> equipo) {
            this.equipo = equipo;
        }


}
