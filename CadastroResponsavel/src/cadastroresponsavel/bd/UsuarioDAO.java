/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kawany.fernandes
 */
public class UsuarioDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;

    public UsuarioDAO() {
    }
    
        
    public void inserir(Usuario u){
        try{
            con = cf.recebeConexao();
            stm = con.prepareStatement("INSERT INTO usuario (nome, prontuario, senha) VALUES (?,?,?)");
            
            stm.setString(1, u.getNome());
            stm.setString(2, u.getProntuario());
            stm.setString(3, u.getSenha());
            
            stm.executeUpdate();
            
        }catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
    
    public boolean verificaUsuario(Usuario u){
        try{
            con = cf.recebeConexao();
            
            stm = con.prepareStatement("SELECT * FROM Usuario WHERE prontuario=? AND senha=?");
           
            stm.setString(1, u.getProntuario());
            stm.setString(2, u.getSenha());
            rs = stm.executeQuery();
            
            if (!rs.next()){
                 return false;
            }else{
                return true;
            }
            
        }catch (SQLException ex) {
                throw new RuntimeException("Exceção: " + ex);
        }
    } 
}
