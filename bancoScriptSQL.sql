DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco;
USE banco;

CREATE TABLE conta (
    numeroConta CHAR(6) PRIMARY KEY,
    agencia CHAR(4) NOT NULL,
    dataContaAbertura DATE NOT NULL,
    senha CHAR(20) NOT NULL
);

CREATE TABLE contaCorrente (
    numeroConta CHAR(6) PRIMARY KEY,
    saldo DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    FOREIGN KEY (numeroConta) REFERENCES conta(numeroConta)
);

CREATE TABLE contaPoupanca (
    numeroConta CHAR(6) PRIMARY KEY,
    saldo DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    dataUltimoRendimento DATE,
    FOREIGN KEY (numeroConta) REFERENCES conta(numeroConta)
);