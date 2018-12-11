/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import cadastroresponsavel.controller.ResponsavelController;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author kawany.fernandes
 */
public class ComparaResponsavel implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        ResponsavelController rc = new ResponsavelController();
        
        Responsavel r1;
        Responsavel r2;
        if(rc.obterResponsavel(o1).isEmpty()){
            r1=new Responsavel();
            r1.setNome("Sem responsavel");
        }else{
            r1 = rc.obterResponsavel(o1).iterator().next();
        }
        if(rc.obterResponsavel(o2).isEmpty()){
            r2=new Responsavel();
            r2.setNome("Sem responsavel");
        }else{
           r2 =  rc.obterResponsavel(o2).iterator().next();
        }
            
        return r1.getNome().toLowerCase().compareTo(r2.getNome().toLowerCase());
    }
    
}
