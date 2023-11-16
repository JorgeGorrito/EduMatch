CREATE TABLE materia(
	codigo varchar(30) primary key NOT NULL,
	nombre varchar(30)
);

CREATE TABLE tutoria(
	id serial primary key NOT NULL,
	horaInicio time,
	horaFinalizacion time
);

CREATE TABLE persona(
        codigo varchar(30) primary key NOT NULL,
	cedula varchar(30) NOT NULL,
	nombres varchar(30),
	apellidos varchar(30),
	correoInstitucional varchar(30)
);

CREATE TABLE estudiante(
	codigo varchar(30) primary key NOT NULL,
	cedula varchar(30),
	FOREIGN KEY (cedula) REFERENCES persona(cedula)
);

CREATE TABLE docente(
	codigo varchar(30) primary key NOT NULL,
	cedula varchar(30),
	FOREIGN KEY (cedula) REFERENCES persona(cedula)
);


CREATE TABLE grupo(
	codigo varchar(30) primary key NOT NULL,
	docente varchar(30),
	materia varchar(30),
	tutoria int,
	FOREIGN KEY (codigo) REFERENCES docente(codigo),
	FOREIGN KEY (codigo) REFERENCES materia(codigo),
	FOREIGN KEY (tutoria) REFERENCES tutoria(id)
);

CREATE TABLE actividad(
	id SERIAL PRIMARY KEY NOT NULL,
	horaInicio time,
	horaFinalizacion time,
	codigo varchar(30),
	FOREIGN KEY (codigo) REFERENCES grupo(codigo)
);


ALTER TABLE persona ADD id int;
ALTER TABLE persona ADD CONSTRAINT fk_id_actividad FOREIGN KEY (id) REFERENCES actividad(id);


