import java.util.Scanner;

public class Att_G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite um n�mero: ");
		num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		sc.close();
	}

}
