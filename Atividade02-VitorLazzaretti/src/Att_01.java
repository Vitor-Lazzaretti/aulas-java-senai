import java.util.Scanner;

public class Att_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaPonderada;
		
		System.out.print("Nota do Laboratório: ");
		nota1 = sc.nextDouble();
		System.out.print("Nota da Avaliação Semestral: ");
		nota2 = sc.nextDouble();
		System.out.print("Nota do Exame Final: ");
		nota3 = sc.nextDouble();
		
		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;
		
		System.out.println("----------------------------------");
		System.out.println("Média Ponderada: " + mediaPonderada);
		System.out.println("----------------------------------");

		
		if(mediaPonderada >= 8) {
			System.out.println("Conceito A");
		}
		if(mediaPonderada >= 7 && mediaPonderada < 8) {
			System.out.println("Conceito B");
		}
		if(mediaPonderada >= 6 && mediaPonderada < 7) {
			System.out.println("Conceito C");
		}
		if(mediaPonderada >= 5 && mediaPonderada < 6) {
			System.out.println("Conceito D");
		}
		if(mediaPonderada >= 0 && mediaPonderada < 5) {
			System.out.println("Conceito E");
		}
		
		sc.close();
	}

}
