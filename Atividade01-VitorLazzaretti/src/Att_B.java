import java.util.Scanner;

public class Att_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, n5, soma, div8;
		System.out.print("Digite o primeiro n�mero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		n2 = sc.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		n3 = sc.nextDouble();
		System.out.print("Digite o quarto n�mero: ");
		n4 = sc.nextDouble();
		System.out.print("Digite o quinto n�mero: ");
		n5 = sc.nextDouble();
		soma = n1 + n2 + n3 + n4 + n5;
		div8 = soma / 8;
		System.out.println("A soma desses n�meros � "+ soma);
		System.out.println(soma + " dividido por 8 � " + div8);
		sc.close();
	}

}
