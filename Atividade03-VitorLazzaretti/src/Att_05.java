import java.util.Scanner;

public class Att_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, salario, aumento;
		System.out.println("Qual seu cargo? ");
		opcao = sc.nextInt();
		System.out.println("Qual seu sal�rio? ");
		salario = sc.nextInt();
		if(opcao == 1) {
			aumento = salario + (salario * 50 / 100);
			System.out.println("Novo sal�rio: " + aumento);
		} else if(opcao == 2) {
			aumento = salario + (salario * 35 / 100);
			System.out.println("Novo sal�rio: " + aumento);
		} else if(opcao == 3) {
			aumento = salario + (salario * 20 / 100);
			System.out.println("Novo sal�rio: " + aumento);
		} else if(opcao == 4) {
			aumento = salario + (salario * 10 / 100);
			System.out.println("Novo sal�rio: " + aumento);
		} else if(opcao == 5) {
			aumento = salario;
			System.out.println("N�o tem aumento! Sal�rio: " + aumento);
		} else {
			System.out.println("Inv�lido!");
		}
		
		sc.close();
	}

}
