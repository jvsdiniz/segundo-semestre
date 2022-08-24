
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TesteMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meu primeiro objeto :) 
        // Instânciando a classe utilitarios
        Utilitarios util = new Utilitarios();
        //Invocando o metodo
        util.exibirLinha();
        
        
        // Essa variavel não precisa ter o mesmo nome
        // do argumento do metodo, mas precisa ter o mesmo tipo
        String nome = "joãozinho ";
        
        util.exibirNome(nome);
        
    
        System.out.println("Exibindo nome decorado");
        util.exibirLinha();
        util.exibirNomeDecorado("Andressa<3");
        util.exibirLinha();
        
        Calculadora calc = new Calculadora();
        Double soma = calc.somar();
        System.out.println(soma);
        
        System.out.println("Digite os numeoros:");
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        
        Double resultado = calc.somar(num1, num2);
        System.out.println("Retorno do somar sobrecarregado: " + resultado);
        
    }
}
