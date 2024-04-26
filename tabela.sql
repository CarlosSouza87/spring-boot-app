
use spring;

create table cor_corpo (
 cor_id bigint primary key auto_increment,
 cor_nome varchar(100) not null unique,
 cor_descricao varchar(200) not null,
 cor_diametro int not null,
 cor_distancia_estrela float
);
insert into cor_corpo (cor_nome,cor_descricao,cor_diametro,cor_distancia_estrela)
 values ('Terra','terceiro planeta',12742, 1),
        ('Marte','quartoplaneta', 6779, null);
        