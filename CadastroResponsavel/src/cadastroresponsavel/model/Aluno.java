/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import cadastroresponsavel.ui.AlunosTableModelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author kawany.fernandes
 */
public class Aluno extends Observable{
    private List<Aluno> alunos = new ArrayList();

   private String nome;
    private int prontuario;
    private String telefone;
    private String data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
 public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
       
}
