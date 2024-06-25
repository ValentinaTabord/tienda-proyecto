create database tiendaValen;

use tiendaValen;

create table Categorias (
categori_id int,
nombre varchar (100)
);

create table Productos (
id int,
nombre varchar (100),
precio float,
categoria_id int
);

create table Consumidores (
id int,
nombre varchar (100)
);

create table Proveedores (
id_proveedor int,
nombre varchar (100),
precio float
);