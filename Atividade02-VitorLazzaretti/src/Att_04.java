import java.util.Scanner;

public class Att_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;

		System.out.println("Escreva o primeiro n�mero: ");

		num1 = sc.nextDouble();

		System.out.println("Escreva o segundo n�mero: ");

		num2 = sc.nextDouble();

		System.out.println("Escreva o terceiro n�mero: ");

		num3 = sc.nextDouble();

		System.out.println("Ordem crescente: ");
		if(num3 < num2 && num3 < num1) {
			System.out.println(num3);
			if(num2 < num1) {
				System.out.println(num2);
				System.out.println(num1);
			}
			if(num1 < num2) {
				System.out.println(num1);
				System.out.println(num2);
			}
		}
		if(num2 < num3 && num2 < num1) {
			System.out.println(num2);
			if(num3 < num1) {
				System.out.println(num3);
				System.out.println(num1);
			}
			if(num1 < num3) {
				System.out.println(num1);
				System.out.println(num3);
			}
		}
		if(num1 < num3 && num1 < num2) {
			System.out.println(num1);
			if(num3 < num2) {
				System.out.println(num3);
				System.out.println(num2);
			}
			if(num3 > num2) {
				System.out.println(num2);
				System.out.println(num3);
			}
		}
		sc.close();
	}
}
