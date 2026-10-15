drop database if exists banco;
create database banco;
use banco;

create table conta (
idConta int auto_increment primary key,
numeroConta char(6) not null unique,
agencia char(4) not null,
dataConta date
);

create table contaCorrente(
idConta int primary key,
saldo decimal (10,2) not null default 0.00,
foreign key (idConta) references Conta(idConta)
);

create table contaPoupanca(
idConta int primary key,
saldo decimal (10,2) not null default 0.00,
dataUltimoRendimento date,
foreign key (idConta) references Conta(idConta)
);