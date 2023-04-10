package com.mycompany.aula09;
public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
   
    //construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //getters & setters
    public double getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //métodos
    public void calcSalario(){
        
    } 
    public double calcINSS(){
        return (0.11*salario);
    }
    public double calcIRPF(){
       double aux;
       if (salario < 1800){
       aux = 0.15 * salario; 
       }else aux = 0.27* salario;
       return (aux);  
    }     
}
