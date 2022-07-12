import java.util.Scanner;

public class Att_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sacoKg, racaoGramas;
		System.out.println("Peso do saco em Kg: ");
		sacoKg = sc.nextDouble();
		System.out.println("Ração para cada gato em gramas: ");
		racaoGramas = sc.nextDouble();
		
		System.out.println("Sobrará no saco após alimentar os gatos por 5 dias: " + (sacoKg * 1000 - racaoGramas * 10) + " gramas.");
		
		sc.close();
	}

}
