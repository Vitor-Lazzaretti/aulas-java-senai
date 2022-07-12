import java.util.Scanner;

public class Att_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1;
		
		System.out.println("Digite um número: ");
		num1 = sc.nextDouble();
		
		if(num1 % 2 == 0) {
			System.out.println("Par");
		}
		if(num1 % 2 == 1) {
			System.out.println("Impar");
		}
		sc.close();
	}

}
