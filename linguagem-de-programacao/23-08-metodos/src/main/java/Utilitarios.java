/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Utilitarios {
    
    // Assinatura do método
    // Retorno: void; esse não retorna nada
    // Nome: exibirLinha
    // Argumentos: aqui não tem nenhum
    // O que tem dentro das {} é o corpo do método
    
    void exibirLinha(){
        System.out.println("_________________");
    }
    
    //Método que recebe um argumento
    //Ao criar metodos podemos aproveitar o mesmo código varias vezes
    //E se mudar, mudo somente por aqui :P
    void exibirNome(String nome){
        System.out.println(String.format("Nome: %s", nome));
    }
    
    void exibirNomeDecorado(String nome){
        System.out.println("_________");
          System.out.println(String.format("Nome: %s", nome));
          System.out.println("________");
    }
    
}
