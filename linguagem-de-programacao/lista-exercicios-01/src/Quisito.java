import java.util.Scanner;

public class Quisito {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bolsa Filhos");
		System.out.println();
		
		System.out.println("Quantos filhos de 0 a 3 anos você tem?");
		Integer f1 = sc.nextInt();
		
		System.out.println("Quantos filhos de 4 a 16 anos você tem?");
		Integer f2 = sc.nextInt();
		
		System.out.println("Quantos filhos de 17 a 18 anos você tem?");
		Integer f3 = sc.nextInt();
		
		
		Integer somaFilhos = (f1 + f2 + f3);
		Double valor1 = (f1 * 25.12);
		Double valor2 = (f2 * 15.88);
		Double valor3 = (f3 * 12.44);
		Double somaValor = (valor1 + valor2 + valor3);
		
		System.out.printf("Você tem um total de " + somaFilhos + " filhos e vai receber R$: %.2f", somaValor);
	
		sc.close();
	}

}
