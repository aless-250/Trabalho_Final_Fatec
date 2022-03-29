use db_sistema_inventario;
create table IF NOT EXISTS TB_NV_ACESSO(
    id_nv_acesso int(11) NOT NULL AUTO_INCREMENT,
    nm_acesso varchar(50) NOT NULL,
    ds_acesso varchar(255) NOT NULL,
    st_ativo boolean NOT NULL DEFAULT true,
    PRIMARY KEY (id_nv_acesso)
);
create table if not exists TB_SENHA(
    id_senha int(11) NOT NULL AUTO_INCREMENT,
    ds_senha varchar(60) NOT NULL,
    ds_senha_atual varchar(60),
    dt_cadastro datetime,
    dt_expira datetime,
    st_ativo boolean NOT NULL default true,
    PRIMARY KEY (id_senha)
);
create table if not exists TB_USUARIO(
    id_usuario int(11) NOT NULL AUTO_INCREMENT,##identificação do usuario
    ds_usuario varchar(255) NOT NULL,
    nm_usuario varchar(50) NOT NULL,
    ds_cargo varchar(50) NOT NULL,
    ds_setor varchar(50) NOT NULL,
    nr_registro varchar(50) NOT NULL,
    nr_rg varchar(50) NOT NULL,
    nr_ctps varchar(50) NOT NULL,
    nr_cpf varchar(50) NOT NULL,
    ##contato
    nr_telefone varchar(50) NOT NULL,
    nr_celular varchar(50) NOT NULL,
    ds_email varchar(255) NOT NULL,
    ##endereço
    ds_endereco varchar(255) NOT NULL,
    ds_bairro varchar(50) NOT NULL,
    ds_municipio varchar(50) NOT NULL,
    ##acesso
    ds_login varchar(50) NOT NULL,
    ds_senha varchar(60) NOT NULL,
    id_nv_acesso int(11) NOT NULL,
    id_senha int(11) NOT NULL,
    dt_cadastro datetime,
    dt_expira datetime,
    st_ativo boolean NOT NULL default true,
    PRIMARY KEY (id_usuario),
    FOREIGN KEY (id_nv_acesso) REFERENCES TB_NV_ACESSO(id_nv_acesso),
    FOREIGN KEY (id_senha) REFERENCES TB_SENHA(id_senha)
);
