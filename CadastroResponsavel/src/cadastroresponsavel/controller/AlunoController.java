/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.AlunoDAO;
import cadastroresponsavel.model.Aluno;
import java.util.List;

/**
 *
 * @author kawany.fernandes
 */
public class AlunoController {
    AlunoDAO aluDAO = new AlunoDAO();
    
    public void inserir(Aluno a){
        aluDAO.inserir(a);
    }
    
    public List visualizarAluno(){
        return aluDAO.visualizarAlunos();
    }
    
    public void atualizar(Aluno a) {
        aluDAO.atualizar(a);
    }
}
