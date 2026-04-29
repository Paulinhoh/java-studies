SELECT totaulas,
    count(*)
from cursos
GROUP BY totaulas
ORDER BY totaulas;
-- 
SELECT carga,
    count(*)
from cursos
WHERE totaulas = 30
GROUP BY carga;
-- 
-- having é o WHERE do group by (só pode ser trabalhado com a coluna usada no GROUP BY)
SELECT ano,
    count(*)
from cursos
where totaulas > 30
GROUP BY ano
HAVING count(ano) >= 5
ORDER BY count(*) DESC;
-- 
SELECT avg(carga)
from cursos;
-- 
SELECT carga,
    count(*)
FROM cursos
WHERE ano > 2015
GROUP BY carga
HAVING carga > (
        SELECT avg(carga)
        from cursos;
);