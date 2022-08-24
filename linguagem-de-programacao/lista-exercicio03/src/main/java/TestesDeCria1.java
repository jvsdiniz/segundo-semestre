/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TestesDeCria1 {
    
    Double calcularMedia(Double num1, Double num2){
        return num1 * 0.4 + num2 * 0.6;
    }
    
    Double classesSociais(Double salario){
            return salario/1100.00;
        }
        

    
    void classificaIdade(Integer idade){
        if(idade > 0 && idade <= 2){
            System.out.println("Bebê");
        } else if(idade > 2 && idade <= 11){
            System.out.println("Criança");
        }else if(idade > 11 && idade <= 19){
            System.out.println("Adolescente");
        }else if(idade > 19 && idade<= 30){
        System.out.println("Jovem");
        }else if(idade > 30 && idade <= 60){
            System.out.println("Adulto");
        }else if(idade > 60){
            System.out.println("Idoso");
        }else{
            System.out.println("Insira uma idade valida!");
        }     
    }
    
   
    
}
