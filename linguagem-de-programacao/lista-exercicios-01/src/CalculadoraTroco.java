import java.util.Scanner;

public class CalculadoraTroco {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor unitário do produto?");
		Double unit = sc.nextDouble();
		
		System.out.println("Qual foi a quantidade vendida?");
		Integer qtde = sc.nextInt();
		
		System.out.println("Qual o valor pago pelo cliente?");
		Double valor = sc.nextDouble();
		
		
		Double conta = ((unit * qtde) - valor) ;
		System.out.println("Seu troco será de:R$" + conta);
		
		
		sc.close();
	}

}
