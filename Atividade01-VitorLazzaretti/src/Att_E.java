import java.util.Scanner;

public class Att_E {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, vendas;
		System.out.print("Digite o sal�rio do funcion�rio: ");
		salario = sc.nextDouble();
		System.out.print("Digite as vendas: ");
		vendas = sc.nextDouble();
		System.out.println("O total que esse funcion�rio receber� � " + (salario + (vendas * 0.04) ) );
		sc.close();
		}
}
