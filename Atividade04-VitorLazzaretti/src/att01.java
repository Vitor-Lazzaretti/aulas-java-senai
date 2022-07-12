import java.util.Scanner;

public class att01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, salario, aumento, fim;
		
		System.out.println("Digite seu salário: ");
		salario = sc.nextInt();
		
		System.out.println("Digite o código");
		codigo = sc.nextInt();
		
		switch (codigo) {
		case 1: 
			aumento = 50;
			break;
		case 2: 
			aumento = 35;
			break;
		case 3: 
			aumento = 20;
			break;
		case 4: 
			aumento = 10;
			break;
		case 5: 
			aumento = 0;
			break;
		default:
			System.out.println("Valor inválido!");
			sc.close();
			return;
		}
		
		fim = salario + (salario * aumento / 100);
		System.out.println("Seu salário era de " + salario + " reais, com um aumento de " + aumento + "%, seu salário agora é " + fim + " reais.");
		sc.close();
	}

}
