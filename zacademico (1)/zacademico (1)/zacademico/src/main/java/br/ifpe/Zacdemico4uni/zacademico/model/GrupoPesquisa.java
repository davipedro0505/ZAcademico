package br.ifpe.Zacdemico4uni.zacademico.model;

import.java.util.List
public class GrupoPesquisa {
private String CNPJ;
private Strinh nome;
private String descricao;
private String tema;
private String area;
private String professorLider;
private int dataCriacao;
private int dataExpiracao;
private List<Professor> professores;

public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Strinh getNome() {
        return this.nome;
    }

    public void setNome(Strinh nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProfessorLider() {
        return this.professorLider;
    }

    public void setProfessorLider(String professorLider) {
        this.professorLider = professorLider;
    }

    public int getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(int dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getDataExpiracao() {
        return this.dataExpiracao;
    }

    public void setDataExpiracao(int dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}

