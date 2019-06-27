/*

remotemysql.com
user:5FqFBufD61
pass:qrq6FCOaoR




*/

drop database if exists colegio;
create database colegio;
use colegio;
drop table if exists alumnos;
drop table if exists cursos;
 create table cursos(
id int auto_increment primary key,
titulo varchar(25) not null,
profesor varchar(25) not null,
dia enum('lunes','martes','miercoles','jueves','viernes'),
turno enum('mañana','tarde','noche')

);

create table alumnos(

id int auto_increment primary key,
nombre varchar(25) not null,
apellido varchar(25)not null,
edad int,
idCurso int

);

alter table alumnos
add constraint fk_alumnos_idCurso
foreign key(idCurso)
references cursos(id)

;