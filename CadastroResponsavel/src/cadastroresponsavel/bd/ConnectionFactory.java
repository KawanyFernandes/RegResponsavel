/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kawany.fernandes
 */
public class ConnectionFactory {
    
    private Connection con;
    
    public ConnectionFactory() {
        con = null;
    }
    
    public Connection recebeConexao(){
    if(con == null){
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_responsaveis?user=root");
            }catch(ClassNotFoundException cnfe){
                System.out.println("Exceção de classe não encontrada.");
            }catch (SQLException sqle){
                System.out.println("Exceção de conexão ao banco.");
            }
            
        }
        return con;
    }
}
