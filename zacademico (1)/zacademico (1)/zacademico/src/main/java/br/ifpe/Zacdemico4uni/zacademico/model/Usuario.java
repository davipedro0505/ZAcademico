package br.ifpe.Zacdemico4uni.zacademico.model;

public class Usuario{

private String nome;
private String senha;
private String email;

//Construtor
public Usuario(String nome, String senha, String email){
this.nome = nome;
this.senha = senha;
this.email = email;
}

//Get e Set para cada atributo apenas da classe filha
 public String getNome(){
    return this.nome;
 }

 public void setNome(String nome){
    this.nome=nome;
 }

 public String getSenha(){
    return this.senha;
 }

 public void setSenha(String senha){
    this.senha=senha;
 }

 public String getEmail(){
    return this.email;
 }

 public void setEmail(String email){
    this.email=email;
 }

 public void imprimeinfo(){
   System.out.println(this.nome);
   System.out.println(this.senha);
   System.out.println(this.email);
 }

 
}