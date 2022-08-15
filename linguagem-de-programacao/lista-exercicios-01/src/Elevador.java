import java.util.Scanner;

public class Elevador {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o limite de peso do elevador");
		Double pesoTotal = sc.nextDouble();
		
		System.out.println("Qual o limite de pessoas do elevador?");
		Integer limite = sc.nextInt();
		
		System.out.println("Qual o peso da 1ª pessoa?");
		Double p1 = sc.nextDouble();
		
		System.out.println("Qual o peso da 2ª pessoa?");
		Double p2 = sc.nextDouble();

		System.out.println("Qual o peso da 3ª pessoa?");
		Double p3 = sc.nextDouble();
		
		
		Double soma = p1 + p2 + p3;
		
		System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limite
				+ " pessoas. O peso total no elevador é de " + soma + "Kg,\n sendo que ele suporta " + pesoTotal + "Kg");
		
		
		sc.close();
	}

}
