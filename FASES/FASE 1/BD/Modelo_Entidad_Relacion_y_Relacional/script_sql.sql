DROP TABLE  duenno cascade constraints;
DROP TABLE jugador cascade constraints;
drop table juegaPartido cascade constraints;
DROP TABLE partido cascade constraints;
drop table equipo cascade constraints;
drop table jornada cascade constraints;
drop table liga cascade constraints;
drop table usuarios cascade constraints;

CREATE TABLE duenno (
  codduenno NUMBER  GENERATED ALWAYS AS IDENTITY,
  nombre VARCHAR(10) NOT NULL,
  apellido1 VARCHAR(15) NOT NULL,
  apellido2 VARCHAR(15) NOT NULL,
  PRIMARY KEY (codduenno));

CREATE TABLE liga (
  codLiga NUMBER  GENERATED ALWAYS AS IDENTITY,
  nombre VARCHAR(15) NOT NULL,
  PRIMARY KEY (codLiga));

CREATE TABLE equipo (
  codEquipo NUMBER  GENERATED ALWAYS AS IDENTITY,
  duenno_codduenno INT NOT NULL,
  nombre VARCHAR(10) NOT NULL,
  Liga_codLiga INT NOT NULL,
  partido_codPartido NUMBER,
  PRIMARY KEY (codEquipo),
  CONSTRAINT fk_equipo_duenno1
    FOREIGN KEY (duenno_codduenno)
    REFERENCES duenno (codduenno),
  CONSTRAINT fk_equipo_Liga1
    FOREIGN KEY (Liga_codLiga)
    REFERENCES liga (codLiga),
  CONSTRAINT fk_equipo_has_partido_partido
    FOREIGN KEY (partido_codPartido)
    REFERENCES partido (codPartido)
    );

CREATE TABLE jugador (
  codJugador NUMBER  GENERATED ALWAYS AS IDENTITY,
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

CREATE TABLE jornada (
  codJornada NUMBER  GENERATED ALWAYS AS IDENTITY,
  fechaJornadaI DATE NOT NULL,
  fechaJornadaF DATE NOT NULL,
  Liga_codLiga INT NOT NULL,
  PRIMARY KEY (codJornada),
  CONSTRAINT fk_jornada_Liga1
    FOREIGN KEY (Liga_codLiga)
    REFERENCES liga (codLiga)
    );

CREATE TABLE partido (
  codPartido NUMBER  GENERATED ALWAYS AS IDENTITY,
  jornada_codJornada number,
  resultadoE1 NUMBER(15),
  resultadoE2 NUMBER(15),
  fecha DATE NOT NULL,
  hora VARCHAR(5) NOT NULL,
  jugado VARCHAR(15),
  PRIMARY KEY (codPartido),
  CONSTRAINT fk_partido_jornada1
    FOREIGN KEY (jornada_codJornada)
    REFERENCES jornada (codJornada)
);

CREATE TABLE juegaPartido (
  equipo_codEquipo NUMBER,
  partido_codPartido NUMBER,
  PRIMARY KEY (equipo_codEquipo, partido_codPartido),
  CONSTRAINT fk_equipo_has_partido_equipo1
    FOREIGN KEY (equipo_codEquipo)
    REFERENCES equipo (codEquipo),

);

CREATE TABLE usuarios (
  codUsuario NUMBER  GENERATED ALWAYS AS IDENTITY,
  nombre VARCHAR(15) NOT NULL,
  contrasenna VARCHAR(15) NOT NULL,
  permiso VARCHAR(15) NOT NULL,
  PRIMARY KEY (codUsuario)
);


--TRIGGERS
set serveroutput on;


CREATE OR REPLACE TRIGGER maxJugadores
BEFORE INSERT ON jugador for each row
DECLARE
    numJugadores int;
BEGIN
    select count(codJugador) into numJugadores from jugador where :new.equipo_codEquipo =  equipo_codEquipo;
    if numJugadores >=6 then
        Raise_Application_Error(-20001, 'LÍMITE DE JUGADORES');
    end if;
END;

CREATE OR REPLACE TRIGGER maxSalarioEquipo
BEFORE INSERT ON jugador for each row
DECLARE
    SalarioEquipo int;
BEGIN
    select sum(sueldo) into SalarioEquipo from jugador where :new.equipo_codEquipo = Equipo_Codequipo;
    if salarioEquipo >=200000 then
        Raise_Application_Error(-20002, 'LÍMITE DE SALARIO DE JUGADORES');
    end if;
END;


--PRODECIMIENTOS ALMACENADOS

drop procedure insertarJugador;
CREATE PROCEDURE insertarJugador(nombreJugador   VARCHAR2,  apellido1Jugador VARCHAR2, apellido2Jugador VARCHAR2, nicknameJugador VARCHAR2, sueldo number, codEquipoJugador number)
IS
BEGIN
  INSERT INTO jugador(nombre,  apellido1, apellido2, nickname, sueldo , equipo_codEquipo)
     VALUES (INITCAP(nombreJugador),  INITCAP(apellido1Jugador), INITCAP(apellido2Jugador), UPPER(nicknameJugador), sueldo, codEquipoJugador);
END;

drop procedure equipoJuegaPartido;
CREATE PROCEDURE equipoJuegaPartido(codEquipo number,codPartido number)
IS
BEGIN
  INSERT INTO juegaPartido(equipo_codEquipo, partido_codPartido)
     VALUES (codEquipo, codPartido);
END;




/*
exec insertarJugador('rafa','rafa','rafa','rafa',1,1);
select * from equipo;
select * from jugador;
select sum(sueldo) from jugador where Equipo_Codequipo=2;

desc jugador;
desc equipo;
desc liga;
desc duenno;

insert into liga (nombre) values ('prueba');
insert into duenno (nombre, apellido1,apellido2) values ('prueba','prueba', 'prueba');
insert into equipo (Duenno_Codduenno, nombre, liga_codliga) values (1,'prueba',1);
insert into jugador (nombre, apellido1, apellido2, nickname, sueldo, equipo_codequipo) values ('rafa','rafa','rafa','rafa',1,2); 
delete from jugador;
select * from jugador;
select * from equipo;
*/
select * from liga;
insert into liga (nombre) values ('prueba');
insert into jornada (fechajornadai, Fechajornadaf, liga_codLiga) values(To_Date('11-12-18', 'dd/MM/yy'),To_Date('11-12-18',  'dd/MM/yy'),1);
desc jornada;

select  to_date('05-05-05' ,'dd/MM/yy') from dual;

