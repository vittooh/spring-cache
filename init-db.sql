create sequence hibernate_sequence start 1 increment 1;
create table usuarios_estado (id int8 not null, estado varchar(255), qt_acessos int8, primary key (id));


insert into usuarios_estado values (nextval('hibernate_sequence'), 'SP',6000),
(nextval('hibernate_sequence'),'MG',8000),
(nextval('hibernate_sequence'),'RS',7000);