/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.util.List;

/**
 *
 * @author kawany.fernandes
 */
public class ResponsavelController {
    ResponsavelDAO resDAO = new ResponsavelDAO();
    
    public void inserir(Responsavel r){
        resDAO.inserir(r);
    }
    
    public List<Responsavel> obterResponsavel(Aluno a){
        return resDAO.obterResponsavel(a);
    }
    
    public List visualizarResponsaveis(){
        return resDAO.visualizarResponsaveis();
    }
    
    public void removerResponsavel(Responsavel r){
        resDAO.removerResponsavel(r);
    }
}
