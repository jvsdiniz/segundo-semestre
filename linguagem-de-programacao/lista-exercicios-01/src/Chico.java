import java.util.Scanner;

public class Chico {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quanto é o seu salário bruto?");
		Double bruto = sc.nextDouble();
		
		System.out.println("Quanto você gasta de condução de ida?");
		Double passagem = sc.nextDouble();
		
		
		//calculo de descontos
		Double inss = (bruto * 0.10);
		Double ir = (bruto * 0.20);
		Double conducao = (passagem * 2 * 22);
		
		//total de descontos
		Double dTotal = (inss + ir + conducao);
		
		//salario liquido
		Double liquido = (bruto - dTotal);
		
		System.out.println("Seu salário bruto é R$" + bruto + " tem um desconto de R$" + dTotal + " em descontos e receberá um líquido de R$" + liquido );
		
		
		
		sc.close();
	}
	
}
