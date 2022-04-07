package desafio_mv;
import java.util.Objects;
import java.util.Scanner;

public class desafio {
	static lista list = new lista();

	public static void main(String[] args) {
		Scanner entrada;
		char choice;
		String coffe,n,c;
		char s = 's';
		do {
			entrada = new Scanner(System.in);
			System.out.println("Digite o CPF: ");
			c = entrada.nextLine();
			if (list.repeatCpf(c)) {
				System.out.println("CPF já Cadastrado , impossivel continuar!");
				break;
			}
			list.addFirst(c);
			System.out.println("Digite o nome: ");
			n = entrada.nextLine();

			System.out.println("Informe que deseja levar para o café da manhã: ");
			coffe = entrada.nextLine();
			if (list.repeatCafe(coffe)) {
				System.out.println("Café já Cadastrado , impossivel continuar!");
				break;
			}
			list.addCafe(coffe);
			System.out.println("Deseja continuar adicionando?(s/n)");
			choice = entrada.next().charAt(0);
		} while (choice == s);
	}
}