use db_bras;

create table tb_brasprodutos(
id bigint auto_increment,
descricao varchar(255),
valor decimal (8,2),
cor varchar (255),
codigo int,
primary key (id)
);

insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Camiseta", 49.99, "Preta", 02);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("CortaVento", 199.99, "Roxa", 01);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Camisa", 89.49, "Laranja", 52);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Chinelo", 39.99, "Preto", 00);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Short", 49.99, "Azul", 62);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Calça", 159.99, "Preta", 12);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Viseira", 99.99, "Preta", 72);
insert into tb_brasprodutos(descricao, valor, cor, codigo) values ("Biquini", 79.99, "Vermelho", 03);

select * from tb_brasprodutos where valor > 500;

select * from tb_brasprodutos where valor < 500;

update tb_brasprodutos set descricao = "Joias" where id = 5;