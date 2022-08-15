import java.util.Scanner;

public class CadastroUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Scanner number = new Scanner (System.in);
		
		System.out.println("Cadastro");
		System.out.println();
		
		System.out.println("Digite seu login: ");
		String login = sc.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = sc.nextLine();
		
		System.out.println("Quantas vezes você pode errar?");
		Integer qtde = number.nextInt();
		
		System.out.println();
		System.out.println("Seu login é: " + login + " sua senha é: " + senha + ". Você tem " + qtde + " tentativas antes de ser bloqueado!");
		
		sc.close();
		number.close();
	}
}
