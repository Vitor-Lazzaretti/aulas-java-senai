import java.util.Scanner;

public class Att_H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avancar = 1, salario, conta, totalConta = 0;
		System.out.print("Digite seu sal�rio: ");
		salario = sc.nextDouble();
		do {
			System.out.println("Deseja pagar uma conta? Sim (1), N�o (2)");
			avancar = sc.nextDouble();
			if (avancar != 2) {
				System.out.print("Qual o valor da conta? ");
				conta = sc.nextDouble();
				totalConta += conta * 0.95;
			}
		} while (avancar != 2);
		System.out.println("O total que voc� ter� que pagar � " + totalConta);
		System.out.println("Seu sal�rio no final ser� de: " + (salario - totalConta));
		sc.close();
	}

}
