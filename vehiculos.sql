drop table vehiculos;
create table vehiculos(
placa varchar (10) primary key,
marca varchar (50) not null,
modelo varchar (50) not null,
anio int not null,
precio double precision not null,
color varchar (30),
disponible boolean not null

);
select * from vehiculos;

alter table vehiculos add kilometraje int;
