package IFPE.ZAcademico.model;

import jakarta.persistence.*;

public class Aluno extends Usuario {

    private int id;
    private String matricula;
    private String endereco; 
    
    public Aluno() {}

    public Aluno(String nome, String cpf, String emailPessoal, String emailInstitucional,
                 String telefone, String dataNascimento, String matricula, String endereco) {
        super(nome, cpf, emailPessoal, emailInstitucional, telefone, dataNascimento);
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public Long getId() { return id; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}