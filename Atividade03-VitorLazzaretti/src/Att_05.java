import java.util.Scanner;

public class Att_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, salario, aumento;
		System.out.println("Qual seu cargo? ");
		opcao = sc.nextInt();
		System.out.println("Qual seu salário? ");
		salario = sc.nextInt();
		if(opcao == 1) {
			aumento = salario + (salario * 50 / 100);
			System.out.println("Novo salário: " + aumento);
		} else if(opcao == 2) {
			aumento = salario + (salario * 35 / 100);
			System.out.println("Novo salário: " + aumento);
		} else if(opcao == 3) {
			aumento = salario + (salario * 20 / 100);
			System.out.println("Novo salário: " + aumento);
		} else if(opcao == 4) {
			aumento = salario + (salario * 10 / 100);
			System.out.println("Novo salário: " + aumento);
		} else if(opcao == 5) {
			aumento = salario;
			System.out.println("Não tem aumento! Salário: " + aumento);
		} else {
			System.out.println("Inválido!");
		}
		
		sc.close();
	}

}
