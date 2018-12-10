/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Responsavel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kawany.fernandes
 */
public class ResponsavelTableModel extends AbstractTableModel{
    private List<Responsavel> listaResponsavel;
    
     private String[] colunas = {"Nome", "Telefone"};

    public ResponsavelTableModel(List<Responsavel> r) {
        listaResponsavel = r;
    }
    
    
     @Override
    public int getRowCount() {
        return listaResponsavel.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Responsavel resp = listaResponsavel.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return resp.getNome();
            case 1:
                return resp.getTelefone();
            default:
                return "dado inválido";
        }
    }
     
}
