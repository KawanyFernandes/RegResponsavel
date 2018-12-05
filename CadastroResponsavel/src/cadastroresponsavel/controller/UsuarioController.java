/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.UsuarioDAO;
import cadastroresponsavel.model.Usuario;

/**
 *
 * @author kawany.fernandes
 */
public class UsuarioController {
    private UsuarioDAO userDao = new UsuarioDAO();

    public UsuarioController() {
    }
    
    public void cadastrarUsuario(Usuario u){
        userDao.inserir(u);
    }
    
    public boolean  verificarUsuario(Usuario u){
        return userDao.verificaUsuario(u);
    }
    
    public boolean alterarSenha(Usuario u, String senhanova){
        return userDao.alterarSenha(u, senhanova);
    }
    
    public String achaUsuario(Usuario u){
        return userDao.achaUsuario(u);
    }
    
    public boolean validaProntuario(Usuario u){
        return userDao.validaProntuario(u);
    }
}
