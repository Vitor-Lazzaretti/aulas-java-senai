import java.util.Scanner;
public class Att_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, num1, num2, num3;	
		System.out.println("Digite um n�mero de 1 a 3: ");
		base = sc.nextDouble();
		System.out.println("Digite um n�mero: ");
		num1 = sc.nextDouble();
		System.out.println("Digite um outro n�mero: ");
		num2 = sc.nextDouble();
		System.out.println("Digite um mais n�mero: ");
		num3 = sc.nextDouble();
		if(base == 1) {
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
		}
		if(base == 2) {
			if(num3 > num2 && num3 > num1) {
				System.out.println(num3);
				if(num2 > num1) {
					System.out.println(num2);
					System.out.println(num1);
				}
				if(num1 > num2) {
					System.out.println(num1);
					System.out.println(num2);
				}
			}
			if(num2 > num3 && num2 > num1) {
				System.out.println(num2);
				if(num3 > num1) {
					System.out.println(num3);
					System.out.println(num1);
				}
				if(num1 > num3) {
					System.out.println(num1);
					System.out.println(num3);
				}
			}
			if(num1 > num3 && num1 > num2) {
				System.out.println(num1);
				if(num3 < num2) {
					System.out.println(num3);
					System.out.println(num2);
				}
				if(num3 < num2) {
					System.out.println(num2);
					System.out.println(num3);
				}
			}
		}
		if(base == 3) {
			if(num3 > num2 && num3 > num1) {
				System.out.println(num2);
				System.out.println(num3);
				System.out.println(num1);
			}
			if(num2 > num3 && num2 > num1) {
				System.out.println(num3);
				System.out.println(num2);
				System.out.println(num1);
			}
			if(num1 > num3 && num1 > num2) {
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num3);
			}
		}
		sc.close();
	}
}