
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestesDeCria1 calc = new TestesDeCria1();
        Double salario;
        
        System.out.println("Classificando você socioeconomicamente!");
        System.out.println();
        
        System.out.println("Informe seu salário:");
        salario = sc.nextDouble();
                
        System.out.println("Você recebe aproximadamente " + calc.classesSociais(salario) + " salarios minimos");
        // para arrendondar utilizar o string format ... %s; %d ... ver no moodle 
        
    }
}
