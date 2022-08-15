import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Descobrindo sua idade");
		System.out.println();
		
		System.out.println("Como você se chama?");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome + "! Qual o seu ano de nascimento?");
		Integer ano = sc.nextInt();
		
		Integer conta = (2030 - ano);
		
		System.out.println("Em 2030 você terá " + conta + " anos.");
		
		
		sc.close();
	}

}
