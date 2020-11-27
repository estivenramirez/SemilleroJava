CREATE TABLE persona (
    id int NOT NULL AUTO_INCREMENT,
    nombres varchar(255) NOT NULL,
    apellidos varchar(255),
    telefono varchar(255),
    PRIMARY KEY (ID)
);

-- cuenta
CREATE TABLE `cuenta` (
  id int NOT null AUTO_INCREMENT,
  `numero` varchar(255) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `tipoCuenta` varchar(255) DEFAULT NULL,
  `id_persona` int DEFAULT NULL,
  PRIMARY KEY (`id`),
    FOREIGN KEY (id_persona) REFERENCES persona(id)
);

INSERT INTO persona (nombres, apellidos, telefono) VALUES('Pedro', 'Lopez', '573005004040');
INSERT INTO persona (nombres, apellidos, telefono) VALUES('Ana', 'Gomez', '574007002020');

INSERT INTO cuenta (numero, saldo, tipoCuenta, id_persona) values ('00132423423', 20000000.0, 'ahorros', 2);
INSERT INTO cuenta (numero, saldo, tipoCuenta, id_persona) values ('001324234000', 10000000.0, 'ahorros', 3);
INSERT INTO cuenta (numero, saldo, tipoCuenta, id_persona) values ('001324234001', 10000000.0, 'ahorros', 3);

