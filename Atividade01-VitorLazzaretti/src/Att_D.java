import java.util.Scanner;

public class Att_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco;
		System.out.print("Digite o pre�o da gasosa: ");
		preco = sc.nextDouble();
		System.out.println("O pre�o com valor aumentado � " + preco*1.10);
		sc.close();
	}
}
