/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
            stm = con.prepareStatement("INSERT INTO responsavel (nome, telefone, data, id_aluno) VALUES (?,?,?,?)");
            stm.setString(1, r.getNome());
            stm.setString(2, r.getTelefone());
            stm.setString(3, r.getData());
            stm.setInt(4, r.getAlunoID());
            stm.executeUpdate();
        }catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
    
    public List<Responsavel> obterResponsavel(Aluno a) {
         List<Responsavel> responsaveis = new ArrayList();
         try{
            
            con = cf.recebeConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM responsavel WHERE id_aluno = ?");
            stm.setInt(1, a.getProntuario());
            
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                Responsavel r = new Responsavel();
                r.setResponsavelID(rs.getInt("id"));
                r.setNome(rs.getString("nome"));
                r.setTelefone(rs.getString("telefone"));
                responsaveis.add(r);
            }
        } catch (SQLException sqle){
            System.out.println("Exceção de conexão ao banco.");
            sqle.printStackTrace();
        }
         return responsaveis;
    }
     
    public List visualizarResponsaveis(){
       try {
            List a = new LinkedList();
            //List r = new LinkedList();
            
            con = cf.recebeConexao();
            stm = con.prepareStatement("SELECT * FROM responsavel ");
            rs = stm.executeQuery();
            
            while(rs.next()) {
                Responsavel resp = new Responsavel();
                
                resp.setNome(rs.getString("nome"));
                resp.setData(rs.getString("data"));
                resp.setTelefone(rs.getString("telefone"));
                resp.setAlunoID(rs.getInt("id_aluno"));
                
                resp.setResp(a);
                a.add(resp);
            }   
            
            return a;           
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
   
    public void removerResponsavel(Responsavel r){
         try {
            con = cf.recebeConexao();
            stm = con.prepareStatement("DELETE FROM responsavel where  id = ?");
            stm.setInt(1, r.getResponsavelID());
            
            
            stm.executeUpdate();                
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        } 
    }
}
