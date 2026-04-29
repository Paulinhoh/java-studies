INSERT INTO cursos VALUES
('1','HTML4','Curso de HTML5','40','37','2014'),
('2','Algoritmos','Lógica de programação','20','15','2014'),
('3','Photoshop','Dicas de photoshop CC','10','8','2014'),
('4','PGP','Curso de PHP para iniciantes','40','20','2010'),
('5','Jarva','Introdução a linguagem Java','10','29','2000'),
('6','MySQL','Banco de Dados MySQL','30','15','2016'),
('7','Word','Curso completo de Word','40','30','2016'),
('8','Sapateado','Danças Ritmicas','40','30','2018'),
('9','Cozinha Arabe','Aprenda a fazer kibe','40','30','2018'),
('10','Youtuber','Gerar polemica e ganhar inscritos','5','2','2018');
-- 
-- atualizando valores das linhas
UPDATE cursos
SET nome = 'HTML5'
WHERE idcurso = '1';
-- 
UPDATE cursos
set nome = 'PHP', ano = '2015'
WHERE idcurso = '4';
-- 
UPDATE cursos
set nome = 'Java', ano = '2015', carga = '40'
WHERE idcurso = '5'
LIMIT 1;
-- 
-- deletando linhas
DELETE FROM cursos
WHERE idcurso = '8';
-- 
DELETE FROM cursos
WHERE ano = '2018'
LIMIT 3;
-- 
-- deletando todas as linhas
TRUNCATE TABLE cursos;