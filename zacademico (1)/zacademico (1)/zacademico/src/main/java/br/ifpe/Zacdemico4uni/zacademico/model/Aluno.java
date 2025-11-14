package br.ifpe.Zacdemico4uni.zacademico.model;

public class Aluno extends Usuario{
private String matricula;

//Construtor
public Aluno(String nome, String senha, String email, String matricula){

    super(nome,senha,email);//acontece porque eles estão privados
    this.matricula=matricula;
}

//Get e Set para cada atributo apenas da classe filha
public String getMatricula(){
    return this.matricula;
}

public void setMatricula(String matricula){
this.matricula=matricula;
}

@Override 
 public void imprimeinfo(){
   System.out.println(this.getNome());
   System.out.println(this.getSenha());s
   System.out.println(this.getEmail());
   System.out.println(this.matricula);
 }

}