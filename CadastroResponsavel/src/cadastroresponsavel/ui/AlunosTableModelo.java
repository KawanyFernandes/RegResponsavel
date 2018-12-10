/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.controller.AlunoController;
import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import javax.swing.table.*;
import java.util.*;


/**
 *
 * @author kawany.fernandes
 */
public class AlunosTableModelo extends AbstractTableModel implements Observer {
    private List<Aluno> listaAlunos;
    
    private String[] colunas = {"Nome", "Prontuario", "Responsável"};
    
    private ResponsavelDAO resDAO = new ResponsavelDAO();
    
    public AlunosTableModelo(List<Aluno> a) {
        listaAlunos = a;
        Iterator<Aluno> i = listaAlunos.iterator();
        while (i.hasNext()) {
            Aluno aluno = i.next();
            aluno.addObserver(this);
        }
    }
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = listaAlunos.get(rowIndex);
        Responsavel resp = null;
        if(!resDAO.obterResponsavel(aluno).isEmpty())
        {
         resp = resDAO.obterResponsavel(aluno).get(0);
        }
        switch(columnIndex) {
            case 0:
                return aluno.getNome();
            case 1:
                return aluno.getProntuario();
            case 2:
                if(resp == null){
                    return "Sem responsavel";
                }
                else
                {
                    return resp.getNome();
                }
            default:
                return "Dado inválido";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override 
    public void setValueAt(Object dado, int rowIndex, int columnIndex) {
        Aluno a = listaAlunos.get(rowIndex);
        //Responsavel resp = listaResponsavel.get(rowIndex);
        switch(columnIndex) {
            case 0:
                String nome = (String) dado;
                a.setNome(nome);
                break;
            case 1:
                int prontuario = (int) dado;
                a.setProntuario(prontuario);
                break;
            case 2:
                String nomeresp = (String) dado;
                a.setNome(nomeresp);
                break;
        }
        AlunoController ac = new AlunoController();
        ac.atualizar(a);
    }    
    
    @Override 
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
    
}
