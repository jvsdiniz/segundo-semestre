
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade;
        TestesDeCria1 definir = new TestesDeCria1();
        
        System.out.println("O que vc é de acordo com sua idade");
        System.out.println();   
        
        System.out.println("Informe sua idade:");
        idade = sc.nextInt();
        definir.classificaIdade(idade);
        
    }
}
