#inserir valores id_categoria, nm_categoria, ds_categoria dt_hr, st_ativo
insert into tb_categoria (id_categoria, nm_categoria, ds_categoria, dt_hr, st_ativo) values (1, 'Categoria 1', 'Descrição da categoria 1', now(), 1);
#deletar por id_categoria
delete from tb_categoria where id_categoria = 1;