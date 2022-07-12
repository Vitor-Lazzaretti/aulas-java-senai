import java.util.Scanner;

public class Att_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salMin, hrTrVl, hrExVl, nHrTr, nHrEx, salarioFinal;
		System.out.print("Digite o Valor do salário mínimo: ");
		salMin = sc.nextDouble();
		hrTrVl = salMin/6;
		hrExVl = salMin/3;
		System.out.print("Trabalhou quantas horas? ");
		nHrTr = sc.nextDouble();
		System.out.print("Fez quantas horas extra? ");
		nHrEx = sc.nextDouble();
		salarioFinal = (nHrTr*hrTrVl) + (nHrEx*hrExVl);
		System.out.println("Seu salário total é " + salarioFinal);
		sc.close();
		
	}

}
