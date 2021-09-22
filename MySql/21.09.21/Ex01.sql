/*Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.*/

CREATE DATABASE db_generation_game_online;

use db_generation_game_online;

/*Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.

Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).*/

CREATE TABLE tb_classe(
id BIGINT (4) AUTO_INCREMENT NOT NULL,
nome_classe VARCHAR (30) ,
especialidade VARCHAR(30) NOT NULL,
idade BIGINT(30) NOT NULL,
	PRIMARY KEY (id)

);

/*Popule esta tabela classe com até 5 dados.*/

INSERT INTO tb_classe(nome_classe, especialidade, idade) VALUES ("Kael", "Criativo", 30);
INSERT INTO tb_classe(nome_classe, especialidade, idade) VALUES ("Gabi", "Estratégia", 26);
INSERT INTO tb_classe(nome_classe, especialidade, idade) VALUES ("Fe", "Combate", 32);
INSERT INTO tb_classe(nome_classe, especialidade, idade) VALUES ("Messias", "Coringa", 27);
INSERT INTO tb_classe(nome_classe, especialidade, idade) VALUES ("Jeff", "Stealth", 32); 

/*Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).*/

CREATE TABLE tb_personagem(
	id BIGINT(4) AUTO_INCREMENT  ,
	nome_personagem VARCHAR(30) ,
	nivel_personagem VARCHAR(30)  ,
	clan_personagem VARCHAR(30)  ,
    PRIMARY KEY (id),
	FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);

INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Joseph", "25", "Guard", 38, 1.65, 1);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Morgan", "17", "Wes", 15, 1.55, 3);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("John", "32", "Guard", 23, 1.58, 5);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Gavin", "29", "Wes", 28, 1.85, 2);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Jill", "45", "Nara", 32, 1.75, 3);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Lonyx", "15", "Maki", 28, 1.69, 4);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Alvin", "42", "Nara", 21, 1.65, 3);
INSERT INTO tb_personagem(nome_personagem, nivel_personagem, clan_personagem) 
VALUES("Ellen", "32", "Nami", 23, 1.67, 3);

UPDATE tb_classe SET ataque_base = 2000 WHERE id = 1;
UPDATE tb_classe SET ataque_base = 1200 WHERE id = 2;
UPDATE tb_classe SET ataque_base = 4500 WHERE id = 3;
UPDATE tb_classe SET ataque_base = 1400 WHERE id = 4;
UPDATE tb_classe SET ataque_base = 8500 WHERE id = 5;

SELECT tb_personagem.nome_personagem, tb_personagem.nivel_personagem, faccao_personagem
FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id = tb_personagem.classe_id
WHERE tb_classe.ataque_base >= 2000;


ALTER TABLE tb_classe
ADD defesa_base BIGINT;


UPDATE tb_classe SET tb_classe.defesa_base = 1000 WHERE id = 1;
UPDATE tb_classe SET tb_classe.defesa_base = 5000 WHERE id = 2;
UPDATE tb_classe SET tb_classe.defesa_base = 3500 WHERE id = 3;
UPDATE tb_classe SET tb_classe.defesa_base = 2500 WHERE id = 4;
UPDATE tb_classe SET tb_classe.defesa_base = 500  WHERE id = 5;

SELECT tb_personagem.nome_personagem, tb_personagem.nivel_personagem, clan_personagem
FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id = tb_personagem.classe_id
WHERE tb_classe.defesa_base >= 1000
AND tb_classe.defesa_base <= 2000;

UPDATE tb_personagem SET tb_personagem.nome_personagem = "Canaban" WHERE id = 8;


SELECT tb_personagem.nome_personagem, tb_personagem.nivel_personagem, clan_personagem
FROM tb_personagem
WHERE tb_personagem.nome_personagem LIKE "%C%";


SELECT * FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.classe_id = tb_classe.id;



SELECT tb_personagem.nome_personagem, tb_classe.nome_classe, tb_personagem.faccao_personagem
FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.classe_id = tb_classe.id
WHERE tb_classe.nome_classe = "Arqueiro";



