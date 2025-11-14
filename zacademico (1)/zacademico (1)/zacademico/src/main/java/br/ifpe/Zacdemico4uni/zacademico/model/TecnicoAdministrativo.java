package br.ifpe.Zacdemico4uni.zacademico.model;

public class TecnicoAdministrativo extends Usuario{
private String nivel_de_instrucao;
private String siape;

//Construtor
public TecnicoAdministrativo(String nome, String senha, String email, String siape, String nivel_de_instrucao){
    super(nome,senha,email);
    this.siape=siape;
    this.nivel_de_instrucao=nivel_de_instrucao;
}

//Get e Set para cada atributo apenas da classe filha
public String getSiape(){
    return this.siape;
}

public void setSiape(String siape){
    this.siape=siape;
}

public String getInstrucao(){
    return this.nivel_de_instrucao;
}

public void setInstrucao(String nivel_de_instrucao){
    this.nivel_de_instrucao=nivel_de_instrucao; 
}

@Override 
 public void imprimeinfo(){
   System.out.println(this.getNome());
   System.out.println(this.getSenha());
   System.out.println(this.getEmail());
   System.out.println(this.nivel_de_instrucao);
   System.out.println(this.siape);
 }
}