import java.util.Scanner;

public class Att_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro n�mero: ");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Escreva o segundo n�mero: ");
		
		double num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O maior �: " + num1);
		} 
		
		if (num2 > num1) {
			System.out.println("O maior �:" + num2);
		}
		
		if (num2 == num1) {
			System.out.println("Os dois s�o iguais.");
		}
		
		sc.close();
	}

}
