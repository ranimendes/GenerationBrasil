
use db_emt;

create table tb_estudantes(
id bigint auto_increment,
nome varchar (255),
professor varchar (255),
notas int,
faltas int,
primary key (id)
);

insert into tb_estudantes (nome, professor, notas, faltas) values ("Maryellen", "Carlos", 10, 0);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Johnatan", "Andreia", 5, 7);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Kenya", "Janete", 8, 0);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Rubem", "Carlos", 10, 2);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Amanda", "Andreia", 9, 3);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Noah", "Carlos", 10, 5);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Carlos", "Andreia", 6, 0);
insert into tb_estudantes (nome, professor, notas, faltas) values ("Leticia", "Carlos", 4, 15);

select * from tb_estudantes where notas > 9;

select * from tb_estudantes where notas < 5;

update tb_estudantes set nome = "Josiane" where id = 1;
