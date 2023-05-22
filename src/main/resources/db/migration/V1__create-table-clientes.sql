CREATE TABLE clientes(
    id bigserial NOT NULL,
    nome varchar(100) NOT NULL,
    sexo varchar(100) ,
    aniversario varchar(100),
    logradouro varchar(200),
    bairro varchar (200),
    cep varchar (10),
    cidade varchar (200),
    uf varchar(2),
    complemento varchar(200),
    numero varchar (10),
    contato1 varchar (20),
    contato2 varchar (20),
    contato3 varchar (20),
    email varchar (200),
    redesocial1 varchar(200),
    redesocial2 varchar(200),
    redesocial3 varchar(200),
    PRIMARY KEY(id)
)

