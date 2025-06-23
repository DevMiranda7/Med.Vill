create table pacientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    idade varchar(3) not null,
    altura varchar(4) not null,
    peso varchar(5) not null,
    plano_de_saude varchar(100) not null,
    sintomas varchar(300) not null,
    especialidade varchar(100) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)







)