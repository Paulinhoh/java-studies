ALTER TABLE pessoas
ADD COLUMN profissao varchar(10);
-- 
desc pessoas;
-- 
ALTER TABLE pessoas DROP COLUMN profissao;
--
ALTER TABLE pessoas
ADD COLUMN profissao varchar(10)
AFTER nome;
-- 
ALTER TABLE pessoas
ADD COLUMN codigo int FIRST;
-- 
ALTER TABLE pessoas DROP COLUMN codigo;
-- 
-- alterando as CONSTRAINTS
ALTER TABLE pessoas
modify COLUMN profissao varchar(20) NOT NULL DEFAULT '';
-- 
-- alterando o nome da coluna
ALTER TABLE pessoas CHANGE COLUMN profissao prof varchar(20) NOT NULL DEFAULT '';
-- 
-- renomeando a tabela
ALTER TABLE pessoas
    RENAME TO gafanhotos;
--
CREATE TABLE IF NOT EXISTS cursos (
    nome VARCHAR(30) NOT NULL UNIQUE,
    descricao TEXT,
    carga INT USINGNED,
    totaulas INT,
    ano YAER DEFAULT '2016'
) DEFAULT CHARSET = utf8;
-- 
ALTER TABLE cursos
ADD COLUMN idcurso int FIRST;
ALTER TABLE cursos
ADD PRIMARY KEY (idcurso);
-- 
CREATE TABLE IF NOT EXISTS teste();
DROP TABLE IF EXISTS teste;
-- 