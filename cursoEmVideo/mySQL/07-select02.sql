-- parecido
SELECT *
FROM cursos
WHERE nome LIKE 'p%';
-- 
SELECT *
FROM cursos
WHERE nome LIKE '%a';
-- 
SELECT *
FROM cursos
WHERE nome LIKE '%a%';
-- 
SELECT *
FROM cursos
WHERE nome not LIKE '%a%';
-- 
SELECT *
FROM cursos
WHERE nome not LIKE 'ph%p';
-- 
-- mais um carctere qualquer no final ex: PHP5
SELECT *
FROM cursos
WHERE nome not LIKE 'ph%p_';
-- 
SELECT DISTINCT carga
FROM cursos;
-- 
-- agregação
-- count
SELECT count(*)
FROM cursos;
-- 
SELECT count(*)
FROM cursos
WHERE carga > 40;
-- 
-- max
SELECT max(carga)
FROM cursos
ORDER BY carga;
-- 
SELECT max(totaulas)
FROM cursos
where ano = '2016';
-- 
-- min
SELECT nome,
    min(totaulas)
FROM cursos
where ano = '2016';
-- 
-- sum
SELECT sum(totaulas)
FROM cursos
where ano = '2016';
-- 
-- avg
SELECT avg(totaulas)
FROM cursos
where ano = '2016';