
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Acumulador {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = sc.nextInt();
        Integer soma = numeroDigitado;
        
        while (numeroDigitado != 0){
            System.out.println("Digite um número:");
            numeroDigitado = sc.nextInt();
            soma = soma + numeroDigitado;
        }
        
            System.out.println(soma);
        
        
        
    }
    
}
