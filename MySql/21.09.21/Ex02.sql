CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id_categoria INT NOT NULL AUTO_INCREMENT,
salgada_categoria VARCHAR(255) NOT NULL,
doce_categoria VARCHAR(255) NOT NULL,
tamanho_categoria VARCHAR(255) NOT NULL,
 PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_pizza(
id_pizza INT NOT NULL AUTO_INCREMENT,
temperatura_pizza VARCHAR(255) NOT NULL,
sabor_pizza VARCHAR(255) NOT NULL,
valor_pizza INT,
borda_pizza VARCHAR(255) NOT NULL,
classe_pizza INT,
PRIMARY KEY(id_pizza),
FOREIGN KEY (classe_pizza) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (salgada_categoria, doce_categoria,tamanho_categoria)
VALUES 
("Sim","Não","Grande"),
("Não","Sim","Broto"),
("Sim","Não","Média"),
("Não","Sim","Média"),
("Sim","Não","Grande");

INSERT INTO tb_pizza (temperatura_pizza, sabor_pizza, valor_pizza, borda_pizza, classe_pizza)
VALUES
("Congelada","Vegan","30.00","Sim",1),
("Quente","Quatro Queijos","40.00","Sim",1),
("Quente","Brócolis","28.00","Sim",3),
("Congelada","Morango","25.00","Não",2),
("Quente","Chocolate","25.00","Não",4);

SELECT * FROM tb_pizza WHERE valor_pizza > 45.00;

SELECT * FROM tb_pizza WHERE valor_pizza BETWEEN 29.00 AND 60.00;

SELECT * FROM tb_pizza WHERE sabor_pizza LIKE "%c%";

SELECT sabor_pizza, valor_pizza, salgada_categoria AS Categoria
FROM tb_categoria 
INNER JOIN tb_pizza ON tb_categoria.id_categoria = tb_pizza.classe_pizza;

