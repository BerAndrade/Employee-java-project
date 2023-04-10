package com.mycompany.aula09;
public class Aula09 {

    public static void main(String[] args) {
        
        Empregado [] funcionarios = {new Mensalista("pleno", "João", "Rua 123"),
            new Horista(60, "Maria", "Rua 321")};
        
        for (Empregado e : funcionarios) {
            
            e.calcSalario();           
            System.out.println("\nNome...............: " + e.nome);
            System.out.println("Salário............: " + e.salario); 
            System.out.println("INSS...............: " + e.calcINSS());
            System.out.println("Imposto de Renda...: " + e.calcIRPF());           
        }
    }
}
