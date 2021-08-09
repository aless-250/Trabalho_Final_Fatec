package br.com.Controller;

import java.sql.Connection;     //Faz a conexão com BD
import java.sql.DriverManager;  //Camada intermediaria entre a IDE e o BD
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectionDAO {
    
    public Connection conectaBD(){

        Connection conn = null;
                
        try {
            
            String url = "jdbc:mysql://localhost:3306/bdsistema?user=root&password=Fatec2021";
            conn = DriverManager.getConnection(url);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConectionDAO: " +e.getMessage());
        }
        
        return conn;
    }
    
} //final da classe ConectionDAO