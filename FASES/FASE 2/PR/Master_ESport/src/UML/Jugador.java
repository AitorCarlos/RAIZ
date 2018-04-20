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

public class Jugador extends Persona {
	private Double sueldo;
	private Integer codJugador;
	private String nickname;
	Equipo equipo;

	public Jugador() {
	}

        public Jugador(Double sueldo, Integer codJugador, String nickname, Equipo equipo) {
            this.sueldo = sueldo;
            this.codJugador = codJugador;
            this.nickname = nickname;
            this.equipo = equipo;
        }

        public Jugador(Double sueldo, Integer codJugador, String nickname, Equipo equipo, String nombre, String apellido1, String apellido2) {
            super(nombre, apellido1, apellido2);
            this.sueldo = sueldo;
            this.codJugador = codJugador;
            this.nickname = nickname;
            this.equipo = equipo;
        }
 
	public Integer getCodJugador() {
		return this.codJugador;
	}

	public void setCodJugador(Integer codJugador) {
		this.codJugador = codJugador;
	}

	public Double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Equipo getEquipo() {
                return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
                this.equipo = equipo;
	}

}
