
package br.ifpe.Zacdemico4uni.zacademico.model;

public class Professor extends Usuario{

    private String siape;
    private String area_de_formacao;
    private GrupoPesquisa grupoPesquisa;

    //Construtor
    public Professor (String nome, String senha, String email, String siape, String area_de_formacao){
        super(nome, senha, email);
        this.siape=siape;
        this.area_de_formacao=area_de_formacao;

    }

//Get e Set para cada atributo apenas da classe filha
    public String getSiape(){
        return this.siape;
    }
    public void setSiape(String siape){
        this.siape=siape;
    }

    public String getFormacao(){
        return this.area_de_formacao;
    }
    public void setFormacao(String area_de_formacao){
        this.area_de_formacao=area_de_formacao;
    }

@Override 
 public void imprimeinfo(){
   System.out.println(this.getNome());
   System.out.println(this.getSenha());
   System.out.println(this.getEmail());
   System.out.println(this.area_de_formacao);
   System.out.println(this.siape);
 }
}
