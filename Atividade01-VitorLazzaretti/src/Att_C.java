import java.util.Scanner;

public class Att_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		do {
			System.out.print("Digite um n�mero: ");
			n1 = sc.nextInt();	
			if (n1 == 0) {
				System.out.println("n1 tem que ser maior que zero");
			} else {
				System.out.print("Digite o segundo n�mero: ");
				n2 = sc.nextInt();
				System.out.println("O resto da divis�o entre estes n�meros �: " + n1%n2);
			}	
		} while(n1 < 1);
		
		sc.close();
	}

}
