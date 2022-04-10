use sistema_inventario;
##drop table IF EXISTS TB_NV_ACESSO;
create table IF NOT EXISTS TB_NV_ACESSO(
    id_acesso int(11) NOT NULL AUTO_INCREMENT,
    nm_acesso varchar(50) NOT NULL,
    ds_acesso varchar(255) NOT NULL ,
    st_ativo boolean NOT NULL DEFAULT 1, ## 0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_acesso)
);
##drop table IF EXISTS TB_SENHA;
create table if not exists TB_SENHA(
    id_senha int(11) NOT NULL AUTO_INCREMENT,
    ds_senha varchar(40) NOT NULL,
    ds_senha_atual varchar(40) NOT NULL,
    dt_hr datetime default now(), ##data e hora da ultima alteracao
    st_ativo boolean NOT NULL default 1, ## 0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_senha)
);

##drop table if exists TB_USUARIO;
create table if not exists TB_USUARIO(
    id_usuario int(11) NOT NULL AUTO_INCREMENT,##identificação do usuario
    PRIMARY KEY (id_usuario),
    nm_usuario varchar(50) NOT NULL,
    ds_usuario varchar(255) NOT NULL,
    ds_cargo varchar(50) NOT NULL,
    ds_setor varchar(50) NOT NULL,
    nr_registro varchar(35) , ##numero de registro do usuario
    nr_rg varchar(10) NOT NULL,
    nr_cpf varchar(11) NOT NULL,
    ##ctps
    nr_ctps varchar(7) NOT NULL,
    nr_serie_ctps varchar(5) NOT NULL,
    uf_ctps varchar(2),
    data_emissao_ctps date,
    ##contato
    nr_telefone varchar(50),
    nr_celular varchar(50),
    ds_email varchar(255),
    ##endereço
    ds_endereco varchar(255),
    ds_bairro varchar(50),
    ds_municipio varchar(50),
    ##acesso
    ds_login varchar(50) NOT NULL,
    ##data de cadastro
    dt_hr datetime NOT NULL default now(), ##data e hora de cadastro
    st_ativo boolean NOT NULL default 1 ## 0 - Inativo, 1 - Ativo
    ##nv_acesso
    ##senha
);
########produto############
#endereco do produto
##drop table if exists TB_ENDERECO;
CREATE TABLE IF NOT EXISTS TB_ENDERECO(
    id_endereco int(11) NOT NULL AUTO_INCREMENT,
    nm_endereco varchar(50) NOT NULL,
    ds_endereco varchar(255) NOT NULL,
    ds_endereco_atual varchar(255) NOT NULL, ##atualização
    ds_posicao varchar(50) NOT NULL,##posição do produto
    ds_setor varchar(50) NOT NULL,
    nr_telefone varchar(50) NOT NULL,
    nr_ramal varchar(50) NOT NULL,
    ds_observacao varchar(255) NOT NULL,
    dt_hr datetime NOT NULL default now(), ##data de cadastro
    st_ativo boolean NOT NULL default 1, ##  0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_endereco)
);
#categoria do produto
##drop table if exists TB_CATEGORIA;
CREATE TABLE IF NOT EXISTS TB_CATEGORIA(
    id_categoria int(11) NOT NULL AUTO_INCREMENT,
    nm_categoria varchar(255) NOT NULL,
    ds_categoria varchar(255) NOT NULL,
    dt_hr datetime NOT NULL default now(), ##data de cadastro
    st_ativo boolean NOT NULL default 1, ##  0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_categoria)
);
#tipo do produto
drop table if exists TB_TIPO;
CREATE TABLE IF NOT EXISTS TB_TIPO(
    id_tipo int(11) NOT NULL AUTO_INCREMENT,
    ds_tipo varchar(255) NOT NULL ,
    st_ativo boolean NOT NULL default 1, ##  0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_tipo)
);

drop table if exists TB_PRODUTO;
CREATE TABLE IF NOT EXISTS TB_PRODUTO(
    id_produto int(11) NOT NULL AUTO_INCREMENT,
    cod_produto_interno varchar(50) NOT NULL,
    ds_produto varchar(255) NOT NULL,
    ds_descricao varchar(255) NOT NULL,
    ds_unidade varchar(50) NOT NULL,
    ds_marca varchar(50) NOT NULL,
    ds_modelo varchar(50) NOT NULL,
    nr_serie varchar(50) NOT NULL,
    ds_patrimonio varchar(50) NOT NULL,
    ds_local varchar(50) NOT NULL,
    ds_status varchar(50) NOT NULL,
    ds_observacao varchar(255) NOT NULL,
    ds_cod_barras varchar(50) NOT NULL,
    dt_hr datetime NOT NULL default now(), ##data de cadastro
    st_ativo boolean NOT NULL default 1, ##  0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_produto)
);
#######FORNECEDOR############
drop table if exists TB_FORNECEDOR;
CREATE TABLE IF NOT EXISTS TB_FORNECEDOR(
    id_fornecedor int(11) NOT NULL AUTO_INCREMENT,
    nm_fornecedor varchar(255) NOT NULL,
    nm_razao_social varchar(255) NOT NULL,
    ds_cnpj varchar(50),
    ds_inscricao_estadual varchar(50),
    ds_inscricao_municipal varchar(50),
    nr_telefone varchar(50),
    nr_celular varchar(50),
    ds_endereco varchar(255),
    ds_bairro varchar(50),
    ds_municipio varchar(50),
    ds_telefone varchar(50),
    ds_celular varchar(50),
    ds_email varchar(255),
    ds_observacao varchar(255),
    dt_hr datetime NOT NULL default now(), ##data do cadastro
    st_ativo boolean NOT NULL default 1, ##  0 - Inativo, 1 - Ativo
    PRIMARY KEY (id_fornecedor)
);

##CREATE TB_INVENTARIO

CREATE TABLE IF NOT EXISTS TB_INVENTARIO(
    id_inventario int (11) not null,
    dt_inventario datetime,
    dt_hr datetime not null default now(), ##data do castro
    primary key (id_inventario)
)
