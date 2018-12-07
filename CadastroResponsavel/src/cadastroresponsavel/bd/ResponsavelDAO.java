/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kawany.fernandes
 */
public class ResponsavelDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    
    public void inserir(Responsavel r){
        try{
            con = cf.recebeConexao();
            stm = con.prepareStatement("INSERT INTO responsavel (nome, telefone, data) VALUES (?,?,?)");
            stm.setString(1, r.getNome());
            stm.setString(2, r.getTelefone());
            stm.setString(3, r.getData());
            stm.executeUpdate();
        }catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
}
