-- SELECT
SELECT *
from cursos
ORDER BY nome DESC
LIMIT 10;
-- 
-- selecionando colunas
SELECT nome,
    carga,
    ano
from cursos
ORDER BY nome DESC
LIMIT 10;
-- 
SELECT *
from cursos
WHERE ano = '2016'
ORDER BY nome;
-- 
SELECT nome,
    descricao,
    ano
FROM cursos
where ano != 2016
ORDER BY ano,
    nome;
-- 
SELECT nome,
    ano
FROM cursos
WHERE ano BETWEEN 2014 AND 2016
ORDER BY ano DESC,
    nome ASC;
-- 
SELECT nome,
    ano
FROM cursos
WHERE ano IN(2014, 2016)
ORDER BY ano DESC,
    nome ASC;
--
select *
FROM cursos
WHERE carga > 35
    and totaulas < 30
ORDER BY nome;
--
select *
FROM cursos
WHERE carga > 35
    or totaulas < 30
ORDER BY nome;