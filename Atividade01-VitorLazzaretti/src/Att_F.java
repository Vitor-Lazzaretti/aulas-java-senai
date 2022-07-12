import java.util.Scanner;

public class Att_F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salFun, salMin = 1212;
		
		System.out.print("Digite seu salário: ");
		salFun = sc.nextDouble();
		
		System.out.println("Você ganha " + salFun/salMin + " salários mínimos.");
		
		sc.close();
	}

}
