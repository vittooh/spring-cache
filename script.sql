create sequence hibernate_sequence start 1 increment 1;
create table usuarios_estado (id int8 not null, estado varchar(255), qt_acessos int8, primary key (id));
