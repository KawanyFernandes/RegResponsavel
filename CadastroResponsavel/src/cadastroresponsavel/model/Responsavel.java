/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kawany.fernandes
 */
public class Responsavel implements Comparable<Responsavel>{
    private List<Responsavel> resp = new ArrayList();
    private Aluno aluno;
    private String nome;
    private String telefone;
    private String data;
    private int alunoID;
    private int responsavelID;

    
    
    public int getResponsavelID() {
        return responsavelID;
    }

    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }

    public int getAlunoID() {
        return alunoID;
    }

    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public List<Responsavel> getResp() {
        return resp;
    }

    public void setResp(List<Responsavel> resp) {
        this.resp = resp;
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int compareTo(Responsavel o) {
        return this.getNome().compareTo(o.getNome());
    }
}
