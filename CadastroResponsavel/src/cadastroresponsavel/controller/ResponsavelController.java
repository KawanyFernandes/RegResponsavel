/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.model.Responsavel;

/**
 *
 * @author kawany.fernandes
 */
public class ResponsavelController {
    ResponsavelDAO resDAO = new ResponsavelDAO();
    
    public void inserir(Responsavel r){
        resDAO.inserir(r);
    }
}
