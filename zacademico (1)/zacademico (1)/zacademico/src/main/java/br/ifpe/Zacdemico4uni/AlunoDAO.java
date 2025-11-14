
//classes DAO serve pra inserir, colocar busca no bd
package br.ifpe.zacademico.model;
import org.springframework.jdbc.core.simple.jdbcClient;


import java.util.List;

public class AlunoDAO {

    private final jdbcClient jdbcClient;

public AlunoDAO(jdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }


public Integer create(Aluno aluno){
//retorna o ID
    return jdbcClient.sql("INSERT INTO aluno (nome, cpf, idade, email_pessoal,email_institucional, senha, matricula) values (:nome, :cpf, :idade, :email_pessoal,:email_institucional, :senha, :matricula)") 
            .param("nome", aluno.getNome())
            .param("cpf", aluno.getCpf())
            .param("idade", aluno.getIdade())
            .param("email pessoal", aluno.getEmail_pessoal())
            .param("email institucional", aluno.getEmail_institucional())
            .param("senha", aluno.getSenha())
            .param("matricula", aluno.getMatricula()).update();
   
    }
}



 /*private List <Aluno> cadastroAlunos;
    //Método para inserir Aluno à lista
    public AlunoDAO(List <Aluno> cadastrAlunos){
        this.cadastroAlunos = cadastrAlunos;
    }
    public void createAluno(Aluno aluno){
        this.cadastroAlunos.add(aluno);
    }

    public void deleteAluno(){

    }
}
*/