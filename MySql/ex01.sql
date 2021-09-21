use brigthCompany;

create table tb_funcionaries(
	id bigint auto_increment,
	nome varchar (255),
	salario decimal (8,2),
	cargo varchar (255),
	idade int,
	instrumento varchar (255),
	primary key(id)
);

insert into tb_funcionaries (nome, salario, cargo, idade, instrumento) values ("Tuany", 3500.00, "Vocal", 24, "Cantora" );
insert into tb_funcionaries (nome, salario, cargo, idade, instrumento) values ("Biel", 5000.00, "Baterista", 21, "Ritimo" );
insert into tb_funcionaries (nome, salario, cargo, idade, instrumento) values ("Felipe", 1000.00, "Tecladista", 20, "Teclas" );
insert into tb_funcionaries (nome, salario, cargo, idade, instrumento) values ("Raniel", 10000.00, "Diretor", 27, "ProdutorDiretor" );
insert into tb_funcionaries (nome, salario, cargo, idade, instrumento) values ("Alex", 2500.00, "Apoio", 27, "Vocal2" );


select * from tb_funcionaries where salario > 2000.00;

select * from tb_funcionaries where salario < 2000.00;

update tb_funcionaries set salario = 1500.00 where id = 3 ;
