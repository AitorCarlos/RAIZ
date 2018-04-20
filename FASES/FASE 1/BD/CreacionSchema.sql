DROP TABLE  duenno ;

CREATE TABLE duenno (
  codduenno INT NOT NULL,
  nombre VARCHAR(10) NOT NULL,
  apellido1 VARCHAR(15) NOT NULL,
  apellido2 VARCHAR(15) NOT NULL,
  PRIMARY KEY (codduenno));

DROP TABLE liga;

CREATE TABLE liga (
  codLiga INT NOT NULL,
  nombre VARCHAR(15) NOT NULL,
  PRIMARY KEY (codLiga));

DROP TABLE equipo ;

CREATE TABLE equipo (
  codEquipo INT NOT NULL,
  duenno_codduenno INT NOT NULL,
  nombre VARCHAR(10) NOT NULL,
  Liga_equipo_codEquipo INT NOT NULL,
  Liga_codLiga INT NOT NULL,
  PRIMARY KEY (codEquipo),
  CONSTRAINT fk_equipo_duenno1
    FOREIGN KEY (duenno_codduenno)
    REFERENCES duenno (codduenno),
  CONSTRAINT fk_equipo_Liga1
    FOREIGN KEY (Liga_codLiga)
    REFERENCES liga (codLiga)
    );


DROP TABLE jugador ;

CREATE TABLE jugador (
  codJugador INT NOT NULL,
  nombre VARCHAR(10) NOT NULL,
  apellido1 VARCHAR(15) NULL,
  apellido2 VARCHAR(15) NULL,
  nickname VARCHAR(10) NOT NULL,
  sueldo INT NOT NULL,
  equipo_codEquipo INT NOT NULL,
  PRIMARY KEY (codJugador),
  CONSTRAINT fk_jugador_equipo
  FOREIGN KEY (equipo_codEquipo)
  REFERENCES equipo (codEquipo)
);


DROP TABLE jornada ;

CREATE TABLE jornada (
  codJornada VARCHAR(45) NOT NULL,
  fechaJornadaI DATE NOT NULL,
  fechaJornadaF DATE NOT NULL,
  Liga_equipo_codEquipo INT NOT NULL,
  Liga_codLiga INT NOT NULL,
  PRIMARY KEY (codJornada),
  CONSTRAINT fk_jornada_Liga1
    FOREIGN KEY (Liga_codLiga)
    REFERENCES liga (codLiga)
    );


DROP TABLE partido ;

CREATE TABLE partido (
  codPartido INT NOT NULL,
  jornada_codJornada VARCHAR(15) NOT NULL,
  resultado VARCHAR(15) NOT NULL,
  fecha DATE NOT NULL,
  hora VARCHAR(5) NOT NULL,
  jugado VARCHAR(15) NOT NULL,
  PRIMARY KEY (codPartido),
  CONSTRAINT fk_partido_jornada1
    FOREIGN KEY (jornada_codJornada)
    REFERENCES jornada (codJornada)
);


DROP TABLE juegaPartido ;

CREATE TABLE juegaPartido (
  equipo_codEquipo INT NOT NULL,
  partido_codPartido INT NOT NULL,
  PRIMARY KEY (equipo_codEquipo, partido_codPartido),
  CONSTRAINT fk_equipo_has_partido_equipo1
    FOREIGN KEY (equipo_codEquipo)
    REFERENCES equipo (codEquipo),
  CONSTRAINT fk_equipo_has_partido_partido1
    FOREIGN KEY (partido_codPartido)
    REFERENCES partido (codPartido)
);


DROP TABLE usuarios ;

CREATE TABLE usuarios (
  codUsuario INT NOT NULL,
  nombre VARCHAR(15) NOT NULL,
  contrasenna VARCHAR(15) NOT NULL,
  permiso VARCHAR(15) NOT NULL,
  PRIMARY KEY (codUsuario)
);

