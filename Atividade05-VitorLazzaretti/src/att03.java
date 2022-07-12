import java.util.Scanner;

public class att03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisores = 0, num, i = 1;
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("Digite um número: ");
		num =  sc.nextInt();
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("Divisores: ");
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		do {
			if(num % i == 0) {
				divisores += 1;
				System.out.println(i);
			}
			i++;
		} while(i <= num);
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		if(divisores == 2) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=");

		sc.close();
	}

}
