import java.util.Scanner;

public class Att_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número: ");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Escreva o segundo número: ");
		
		double num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O maior é: " + num1);
		} 
		
		if (num2 > num1) {
			System.out.println("O maior é:" + num2);
		}
		
		if (num2 == num1) {
			System.out.println("Os dois são iguais.");
		}
		
		sc.close();
	}

}
