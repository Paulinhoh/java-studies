CREATE DATABASE cadastro;
-- 
CREATE TABLE pessoas (
    nome varchar(30),
    idade tinyint(3),
    sexo char(1),
    peso float,
    altura float,
    nacionalidade varchar(30)
);
-- 
-- descreve a tabela
DESCRIBE pessoas;
-- 
-- mostra os databases
SHOW DATABASE;
-- 
-- mostra as tabelas
SHOW TABLE;
-- 
-- deleta o database cadastro
DROP DATABASE cadastro;