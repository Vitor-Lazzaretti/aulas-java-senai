import java.util.Scanner;

public class Att_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, notaExame;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("----------------------------------");
		System.out.println("Média: " + media);
		System.out.println("----------------------------------");

		
		if(media >= 7) {
			System.out.println("Aprovada Deusa");
		}
		if(media >= 3 && media < 7) {
			System.out.println("Exameeeeee...");
			
			notaExame = 6 - media;
			
			System.out.println("Para passar de ano, você precisa tirar " + notaExame);
		}
		if(media < 3) {
			System.out.println("Reprovada miga");
		}
		sc.close();

	}

}
