-- 
-- 01. uma lista com as profissoes dos gafanhotos e seus respectivos quatitativos;
select profissao,
    count(*)
from gafanhotos
group by profissao
order by count(*) desc;
-- 
-- 02. quantos gafanhotos homens e quantas mulheres nasceram após 01/jan/2005?;
select sexo,
    count(*)
from gafanhotos
where nascimento > '2005/01/01'
group by sexo
order by count(*) desc;
-- 
-- 03. uma lista com os gafonhotos que nasceram fora do país de origem e o total de pessoas nascidas lá. Só nos interessam os países que tiverem mais de 3 gafanhotos com essa nacionalidade;
select nacionalidade,
    count(*)
from gafanhotos
group by nacionalidade
having nacionalidade != 'Brasil'
    and count(nacionalidade) >= 3
order by count(*) desc;
-- 
-- 04. uma lista agropada pela altura dos gafanhotos, mostrando quantas pessoas pesam mais de 100kg e que estão acima da média de altura de todos os cadastrados;
select altura,
    count(*)
from gafanhotos
where peso >= '100'
group by altura
having altura > (
        select avg(altura)
        from gafanhotos
    )
order by altura;