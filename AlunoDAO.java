package IFPE.ZAcademico.model;

 import org.springframework.jdbc.core.simple.JdbcClient;
 
public class AlunoDAO {

    private final  JdbcClient jdbcClient;

    public AlunoDAO(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Integer create (Aluno aluno) {  return jdbcClient.sql("insert into aluno (nome, cpf, idade, email pessoal, email institucional, senha,matricula, curso) VALUES (:nome, :cpf, :idade, :email pessoal, :email institucional, senha,matricula, curso)").param("nome", aluno.getNome()).param("cpf", aluno.getCpf()).param("idade", aluno.getIdade()).param("email pessoal", aluno.getEmailPessoal()).param("email institucional", aluno.getEmailInstitucional()).param("senha", aluno.getSenha()).param("matricula", aluno.getMatricula()).param("curso", aluno.getCurso()).update;

}}












        
    
