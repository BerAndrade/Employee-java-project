package com.mycompany.aula09;
public class Mensalista extends Empregado{
    
    public String cargo;
    
    public Mensalista(String cargo, String nome, String endereco) {
        super(nome, endereco);
        this.cargo = cargo;
    }
    
     public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void calcSalario(){
        if(cargo == "junior"){
            salario = 2500;
        }else if (cargo == "pleno"){
            salario = 3500;
        }else if (cargo == "senior"){
            salario = 6000;
        }
        
    }   
}
