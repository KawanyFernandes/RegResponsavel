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
import javax.swing.JOptionPane;

/**
 *
 * @author kawany.fernandes
 */
public class AlunoDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    private ResponsavelDAO resDAO = new ResponsavelDAO();
    
    public void inserir(Aluno a){
        try{
            con = cf.recebeConexao();
            stm = con.prepareStatement("INSERT INTO aluno (nome, prontuario, telefone, data) VALUES (?,?,?,?)");
            stm.setString(1, a.getNome());
            stm.setInt(2, a.getProntuario());
            stm.setString(3, a.getTelefone());
            stm.setString(4, a.getData());
            
            stm.executeUpdate();
        }catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
    
    public List visualizarAlunos(){
       try {
            List a = new LinkedList();
            //List r = new LinkedList();
            
            con = cf.recebeConexao();
            stm = con.prepareStatement("SELECT * FROM aluno ");
            rs = stm.executeQuery();
            
            while(rs.next()) {
                Aluno aluno = new Aluno();
                
                aluno.setProntuario(rs.getInt("prontuario"));
                aluno.setNome(rs.getString("nome"));
                aluno.setData(rs.getString("data"));
                aluno.setTelefone(rs.getString("telefone"));
                
                aluno.setAlunos(a);
                a.add(aluno);
            }   
            
            return a;           
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
    
     public void atualizar(Aluno a) {
        try {
            con = cf.recebeConexao();
            stm = con.prepareStatement("UPDATE aluno SET nome = ?, telefone = ?, data = ? WHERE prontuario = ?");
            stm.setString(1, a.getNome());
            stm.setString(2, a.getTelefone());
            stm.setString(3, a.getData());
            stm.setInt(4, a.getProntuario());
            
            stm.executeUpdate();                
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        } 
    }
     
     public Aluno selectAluno(Aluno a){
         try {
            Aluno aluno = new Aluno();
            con = cf.recebeConexao();
            stm = con.prepareStatement("SELECT * FROM aluno where prontuario = ?");
            stm.setInt(1, a.getProntuario());
            rs = stm.executeQuery();
            
            if(rs.next()) {
                aluno.setProntuario(rs.getInt("prontuario"));
                aluno.setNome(rs.getString("nome"));
                aluno.setData(rs.getString("data"));
                aluno.setTelefone(rs.getString("telefone"));
                
            }   
            
            return aluno;           
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
     }
     
    public void remover(Aluno a) {
        try {
            con = cf.recebeConexao();
            stm = con.prepareStatement("DELETE FROM aluno where prontuario = ?");
            stm.setInt(1, a.getProntuario());
            
            stm.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        } 
    }
}
