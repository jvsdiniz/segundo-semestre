import java.util.Scanner;

public class CalculoMedia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Calculo de média");
		System.out.println();
		
		System.out.println("Como você se chama?");
		String nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota:");
		Double n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		Double n2 = sc.nextDouble();
		
		
		Double conta = ((n1 + n2) / 2); 
		System.out.printf("Olá " + nome + ", sua média foi de: %.1f\n", conta);
				
		sc.close();
	}

}
