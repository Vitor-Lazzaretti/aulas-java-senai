import java.util.Scanner;

public class Att_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n1, n2;
		System.out.print("Digite o primeiro n�mero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o primeiro n�mero: ");
		n2 = sc.nextDouble();
		System.out.println("A multiplica��o dos dois n�meros � " + n1*n2);
		sc.close();
	}

}
