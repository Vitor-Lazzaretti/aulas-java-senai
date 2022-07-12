import java.util.Scanner;

public class Att_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		do {
			System.out.print("Digite um número: ");
			n1 = sc.nextInt();	
			if (n1 == 0) {
				System.out.println("n1 tem que ser maior que zero");
			} else {
				System.out.print("Digite o segundo número: ");
				n2 = sc.nextInt();
				System.out.println("O resto da divisão entre estes números é: " + n1%n2);
			}	
		} while(n1 < 1);
		
		sc.close();
	}

}
