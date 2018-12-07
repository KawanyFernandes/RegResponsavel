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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kawany.fernandes
 */
public class AlunoDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    
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
            List r = new LinkedList();
            
            con = cf.recebeConexao();
            stm = con.prepareStatement("SELECT a.nome, a.prontuario, r.nome FROM aluno ");
            rs = stm.executeQuery();
            
            while(rs.next()) {
                Aluno aluno = new Aluno();
                Responsavel resp = new Responsavel();
                aluno.setProntuario(rs.getInt("prontuario"));
                aluno.setNome(rs.getString("nome"));
                resp.setNome("nome");
//                contato.setCodigo(rs.getInt("codigo"));
//                contato.setNome(rs.getString("nome"));
//                contato.setTelefonePrincipal(rs.getString("telefonePrincipal"));                
//                contato.setTelefoneSecundario(rs.getString("telefoneSecundario"));
//                contato.setHorario(rs.getString("horario"));
                //obter todas as chamadas daquele contato
                
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
            stm = con.prepareStatement("UPDATE aluno SET nome = ?, telefone = ? WHERE prontuario = ?");
            stm.setString(1, a.getNome());
            stm.setString(2, a.getTelefone());
            stm.setInt(3, a.getProntuario());
            
            stm.executeUpdate();                
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        } 
    }
}
