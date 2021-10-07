package br.com.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe cirada para...Metodo de autenticação - comparação - acesso ao obj DTO
 * @author Alessandro S Silva
 * @Since Classe criada em &(date) as &(time)
 */
public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO){
        
        conn = new ConectionDAO().conectaBD();
        
        try{
            String sql = "SELECT * FROM tb_usuario WHERE usuario=? and senha=?"; // ? prepara a conexão passando por pstm
            
            PreparedStatement pstm = conn.prepareStatement(sql); //Pega o resultado do select, preparando a conexão
            pstm.setString(1, objUsuarioDTO.getNome());  // 1 - Refere-se ao nome do usuario
            pstm.setString(2, objUsuarioDTO.getSenha()); // 2 - Refere-se a senha do usuario
            
            ResultSet rs = pstm.executeQuery();
            return rs; // retorna o resultado do ResultSet - Query
            
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " +e);
            return null; // caso o resultado seja nulo
        }
        
    }
    
    
    
    

}//fim da classe
