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
public class Duenno extends Persona {

	private Integer codDuenno;
	Equipo equipo;

	public Duenno() {
	}

        public Duenno(Integer codDuenno, Equipo equipo) {
            this.codDuenno = codDuenno;
            this.equipo = equipo;
        }

        public Duenno(Integer codDuenno, Equipo equipo, String nombre, String apellido1, String apellido2) {
            super(nombre, apellido1, apellido2);
            this.codDuenno = codDuenno;
            this.equipo = equipo;
        }
   
	public Integer getCodDuenno() {
		return this.codDuenno;
	}

	public void setCodDuenno(Integer codDuenno) {
		this.codDuenno = codDuenno;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
