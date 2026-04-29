-- 
-- 01. uma lista com o nome de todas as gafanhotas;
select nome
from gafanhotos
where sexo = 'F';
-- 
-- 02. uma lista com os dados de todos aqueles que nasceram entre 1/jan/200 e 31/dez/2015;
select *
from gafanhotos
where nascimento between '2000/01/01' and '2015/12/31';
-- 
-- 03. uma lista com o nome de todos os homens que trabalhan como programadores;
select *
from gafanhotos
where sexo = 'M'
    and profissao = 'Programador';
-- 
-- 04. uma lista com todos os dados de todas as muheres que nasceram no Brasil e que têm seu nome iniciado com a letra J;
select *
from gafanhotos
where sexo = 'F'
    and nacionalidade = 'Brasil'
    and nome like 'j%';
-- 
-- 05. uma lista com o nome e nacionalidade de todos os homens que têm silva no nome, não nasceram no brasil e pesam menos de 100kg;
select *
from gafanhotos
where sexo = 'M'
    and nacionalidade != 'Brasil'
    and peso < '100'
    and nome like '%silva%';
-- 
-- 06. qual a maior altura entre os gafanhotos homens que moram no brasil;
select max(altura)
from gafanhotos
where sexo = 'M'
    and nacionalidade = 'Brasil';
-- 
-- 07. qual a media de peso dos gafanhotos cadastrodos;
select avg(peso)
from gafanhotos;
-- 
-- 08. qual o menor peso entre as gafonatos mulheres que nasceram fora do Brasil e entre 01/jan/1990 e 31/dez/2000;
select min(peso)
from gafanhotos
where sexo = 'F'
    and nacionalidade = 'Brasil'
    and nascimento between '1990/01/01' and '2000/12/31';
-- 
-- 09. quantas gafanhotos mulheres tem mais de 1.90 de altura;
select count(*)
from gafanhotos
where sexo = 'F'
    and altura > '1.90';