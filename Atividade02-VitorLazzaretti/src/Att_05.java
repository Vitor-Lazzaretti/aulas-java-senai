import java.util.Scanner;

public class Att_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4;
		boolean verdade = false;
		
		System.out.println("Escreva o primeiro n�mero: ");

		num1 = sc.nextDouble();

		System.out.println("Escreva o segundo n�mero: ");

		num2 = sc.nextDouble();

		System.out.println("Escreva o terceiro n�mero: ");

		num3 = sc.nextDouble();

		System.out.println("Escreva o quarto* n�mero: ");

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
			System.out.println("Os n�meros do primeiro ao terceiro n�o vieram em ordem crescente.");
		}
		
		sc.close();
		
	}

}
