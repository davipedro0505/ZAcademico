package IFPE.ZAcademico.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Usuario {

    private String nome;
    private String cpf;
    private String emailPessoal;
    private String emailInstitucional;
    private String telefone;
    private String dataNascimento; 

    public Usuario() {}

    public Usuario(String nome, String cpf, String emailPessoal, String emailInstitucional,
                   String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.emailPessoal = emailPessoal;
        this.emailInstitucional = emailInstitucional;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmailPessoal() { return emailPessoal; }
    public void setEmailPessoal(String emailPessoal) { this.emailPessoal = emailPessoal; }

    public String getEmailInstitucional() { return emailInstitucional; }
    public void setEmailInstitucional(String emailInstitucional) { this.emailInstitucional = emailInstitucional; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}