import java.util.Scanner;

public class Att_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, salario, imposto, aumento;
		System.out.println("Qual opção deseja? [1, 2 ou 3] ");
		opcao = sc.nextInt();
		System.out.println("Qual seu salário? ");
		salario = sc.nextInt();
		if(opcao == 1) {
			if(salario < 500) {
				imposto = salario * 5 /1000;
			} else if (salario <= 850) {
				imposto = salario * 10 /1000;
			} else {
				imposto = salario * 15 /1000;
			}
			System.out.println("Imposto: " + imposto);
		} else if (opcao == 2) {
			if(salario < 450) {
				aumento = salario + 100;
			} else if (salario <= 750) {
				aumento = salario + 75;
			} else if (salario <= 1500) {
				aumento = salario + 50;
			} else {
				aumento = salario + 25;
			}
			System.out.println("Aumento: " + aumento);
		} else if (opcao == 3) {
			if(salario <= 700) {
				System.out.println("Mal Remunerado");
			} else {
				System.out.println("Bem Remunerado");
			}
		} else {
			System.out.println("Inválido");
		}
		sc.close();
	}

}
