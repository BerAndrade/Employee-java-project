package com.mycompany.aula09;
public class Horista extends Empregado{
    protected int horas;
    
    public Horista(int horas, String nome, String endereco) {
        super(nome, endereco);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
 
    @Override
    public void calcSalario(){
        salario = horas*50;
    }   
}
