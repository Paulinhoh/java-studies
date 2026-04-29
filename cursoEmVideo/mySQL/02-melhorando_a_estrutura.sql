CREATE DATABASE cadastro,
DEFAULT character SET utf8,
DEFAULT COLLATE utf_general_ci;
-- 
CREATE DATABASE meuBanco;
DROP DATABASE meuBanco;
-- 
CREATE TABLE pessoas (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    nascimento date,
    sexo enum('M', 'F'),
    peso decimal(5, 2),
    altura decimal(3, 2),
    nacionalidade varchar(20) DEFAULT 'Brasil',
    PRIMARY KEY(id)
) DEFAULT charset = utf8;