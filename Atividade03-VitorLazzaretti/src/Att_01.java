import java.util.Scanner;

public class Att_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double escolha, num1, num2;
		
		System.out.print("Somar dois n�meros [1]; \nRaiz quadrada de um n�mero [2];\nEscolha: ");
		
		escolha = sc.nextDouble();
		
		if(escolha == 1) {
			System.out.println("Escolha o primeiro n�mero: ");
			num1 = sc.nextDouble();
			System.out.println("Escolha o segundo n�mero: ");
			num2 = sc.nextDouble();
			System.out.println("A soma � " + (num1+num2));
		} else if (escolha == 2) {
			System.out.print("Escolha o n�mero: ");
			num1 = sc.nextDouble();
			num2 = Math.sqrt(num1);
			System.out.println("Raiz: " + num2);
		} else {
			System.out.println("Op��o inv�lida!");
		}
		sc.close();
	}

}
