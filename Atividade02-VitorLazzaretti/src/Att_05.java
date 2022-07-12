import java.util.Scanner;

public class Att_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4;
		boolean verdade = false;
		
		System.out.println("Escreva o primeiro número: ");

		num1 = sc.nextDouble();

		System.out.println("Escreva o segundo número: ");

		num2 = sc.nextDouble();

		System.out.println("Escreva o terceiro número: ");

		num3 = sc.nextDouble();

		System.out.println("Escreva o quarto* número: ");

		num4 = sc.nextDouble();
		
		if(num3 > num2 && num2 > num1) {
			verdade = true;
			
			if(num4 > num3) {
				System.out.println(num4);
			}
			System.out.println(num3);
			if(num4 > num2 && num4 <= num3) {
				System.out.println(num4);
			}
			System.out.println(num2);
			if(num4 > num1 && num4 <= num2) {
				System.out.println(num4);
			}
			System.out.println(num1);
			if(num4 <= num1) {
				System.out.println(num4);
			}
		}
		
		if(!verdade) {
			System.out.println("Os números do primeiro ao terceiro não vieram em ordem crescente.");
		}
		
		sc.close();
		
	}

}
