package br.com.Class;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 * O Sistema desenvolvido visa o gerenciamento do estoque, com a sua        | 
 * principal caracteristica sendo o controle de inventario.                 |
 * -------------------------------------------------------------------------|
 * Nome do Frame: UsuarioDTO (Classe criada para os seters e geters).       |
 * -------------------------------------------------------------------------|
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 17/05/2020                                                         |
 * Descrição: Desenvolvimento os seters e geters para o login do usuário.   |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------

// <editor-fold defaultstate="collapsed" desc="class UsuarioDTO - Gets and seters"> 
public class UsuarioDTO {
    
    private int id;
    private String nome;
    private String senha;

    
    //Gets & Sets - Usuario
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
} // fim da classe UsuarioDTO
  // </editor-fold> 