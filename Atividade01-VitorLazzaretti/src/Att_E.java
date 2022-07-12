import java.util.Scanner;

public class Att_E {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, vendas;
		System.out.print("Digite o salário do funcionário: ");
		salario = sc.nextDouble();
		System.out.print("Digite as vendas: ");
		vendas = sc.nextDouble();
		System.out.println("O total que esse funcionário receberá é " + (salario + (vendas * 0.04) ) );
		sc.close();
		}
}
