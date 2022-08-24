
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Media {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestesDeCria1 calc = new TestesDeCria1();
        Double num1, num2;
        
        System.out.println("Sistema de medias");
        System.out.println();
        
        System.out.println("Digite os numeros:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        
        Double resultado = calc.calcularMedia(num1, num2);
        System.out.println("Sua média como um aluno SPTECHER é:" + resultado);
        
    }
    
}
