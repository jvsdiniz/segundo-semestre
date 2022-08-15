import java.util.Scanner;

public class CalculoCaloria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quanto tempo você passou aquecendo?");
		Integer aquecimento = sc.nextInt();
		
		System.out.println("Quanto tempo você fez aeróbicos?");
		Integer aerobico = sc.nextInt();
		
		System.out.println("Quanto tempo você fez musculação?");
		Integer musculacao = sc.nextInt();
		
		Integer somaEx = (aquecimento + aerobico + musculacao);
		Integer soma1 = (aquecimento * 12);
		Integer soma2 = (aerobico * 20);
		Integer soma3 = (musculacao * 25);
		Integer total = (soma1 + soma2 + soma3);
		
		System.out.println("Olá, você fez um total de " + somaEx + " minutos de exercícios e perdeu cerca de " + total + " calorias!");
		
		sc.close();
	}
	
}
