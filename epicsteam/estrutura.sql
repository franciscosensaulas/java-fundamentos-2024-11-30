DROP DATABASE IF EXISTS steamdb; -- Apaga o banco de dados (CUIDADO)
CREATE DATABASE steamdb; 
-- Banco de dados é o local que será armazenado as múltiplas tabelas
USE steamdb;
-- Tabela é o local onde será armazenado os múltiplos registros
CREATE TABLE categorias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200)
);
-- PRIMARY KEY é uma chave primária (será única)
-- AUTO_INCREMENT é utilizado para definir um código sequencia automagicamente
-- VARCHAR é o tipo utilizado para texto e 200 é a qtd máxima de caracteres 
-- que pode armazenar


CREATE TABLE softwares (
	id INT PRIMARY KEY AUTO_INCREMENT,
    id_categoria INT NOT NULL,
    nome VARCHAR(150) NOT NULL,
    url VARCHAR(100),
	-- Criando o relacionamento da tabela de softwares com a tabela de categorias
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

INSERT INTO categorias (nome) VALUES
("Programação"),
("Engenharia"),
("Saúde");

SELECT * FROM categorias;
SELECT * FROM softwares;



