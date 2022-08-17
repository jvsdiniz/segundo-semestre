/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class NumerosPares {
    
    public static void main(String[] args) {
        System.out.println("Numeros Pares de 0 a 40");
        
        Integer par = 0;
        
        while(par <= 40){
            par ++;
            
            if(par %2 == 0){
                System.out.println(par);
            }
            
            
        }
    }
    
}
