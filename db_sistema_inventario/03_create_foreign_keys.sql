use db_sistema_inventario;

##TB_NV_ACESSO NA TB_USUARIO
ALTER TABLE TB_USUARIO ADD COLUMN id_acesso INT;
ALTER TABLE TB_USUARIO add FOREIGN KEY (id_acesso) REFERENCES TB_NV_ACESSO(id_acesso) ;

##TB_SENHA NA TB_USUARIO
ALTER TABLE TB_USUARIO ADD COLUMN id_senha INT;
ALTER TABLE TB_USUARIO add FOREIGN KEY (id_senha) REFERENCES TB_SENHA(id_senha) ;

##TB_FORNECEDOR NA TB_PRODUTO
ALTER TABLE TB_PRODUTO ADD COLUMN id_fornecedor INT;
ALTER TABLE TB_PRODUTO add FOREIGN KEY (id_fornecedor) REFERENCES TB_FORNECEDOR(id_fornecedor) ;

##TB_ENDERECO NA TB_PRODUTO
ALTER TABLE TB_PRODUTO ADD COLUMN id_endereco INT;
ALTER TABLE TB_PRODUTO add FOREIGN KEY (id_endereco) REFERENCES TB_ENDERECO(id_endereco) ;

##TB_TIPO_PRODUTO NA TB_PRODUTO
ALTER TABLE TB_PRODUTO ADD COLUMN id_tipo_produto INT;
ALTER TABLE TB_PRODUTO add FOREIGN KEY (id_tipo_produto) REFERENCES TB_TIPO(id_tipo) ;
##TB_CATEGORIA NA TB_PRODUTO
ALTER TABLE TB_PRODUTO ADD COLUMN id_categoria INT;
ALTER TABLE TB_PRODUTO add FOREIGN KEY (id_categoria) REFERENCES TB_CATEGORIA(id_categoria) ;

##TB_USUARIO NA TB_INVENTARIO
ALTER TABLE TB_INVENTARIO ADD COLUMN id_usuario INT;
ALTER TABLE TB_INVENTARIO add FOREIGN KEY (id_usuario) REFERENCES TB_USUARIO(id_usuario) ;

##TB_ENDEREÇO NA TB_INVENTARIO
ALTER TABLE TB_INVENTARIO ADD COLUMN id_endereco INT;
ALTER TABLE TB_INVENTARIO add FOREIGN KEY (id_endereco) REFERENCES TB_ENDERECO(id_endereco) ;

##N PARA N TB_PRODUTO NA TB_INVENTARIO
CREATE TABLE TB_PRODUTO_INVENTARIO(
    id_produto_inventario INT NOT NULL AUTO_INCREMENT,
    id_produto INT NOT NULL,
    id_inventario INT NOT NULL,
    PRIMARY KEY (id_produto_inventario),
    FOREIGN KEY (id_produto) REFERENCES TB_PRODUTO(id_produto),
    FOREIGN KEY (id_inventario) REFERENCES TB_INVENTARIO(id_inventario)
);