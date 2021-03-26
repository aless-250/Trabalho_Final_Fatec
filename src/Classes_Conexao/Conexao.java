/*
Criando a conexão com Banco de Dados db_Controller
Nome: Alessandro
Data: 13/01/2021
*/

package Classes_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	//private static String caminho = "jdbc:mysql://localhost/db_Controller";
	//private static String usuario = "sa";
	//private static String senha = "@dmin";
	
	public static Connection Conectar() throws SQLException{
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		
		//return DriverManager.getConnection("caminho,usuario,senha");
		return DriverManager.getConnection("jdbc:mysql://localhost/db_Controller","sa","@dmin");
			
		} catch (ClassNotFoundException e) {	//Tratamento de erro na conexão com banco
			
			throw new SQLException(e.getException());
			
		}
	}
}
