import java.util.Scanner;

public class Att_L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double show, ingresso;
		System.out.println("Custo do Show: ");
		show = sc.nextDouble();
		System.out.println("Preço do Ingresso: ");
		ingresso = sc.nextDouble();
		System.out.println("Para pagar o custo, será necessário vender " + show/ingresso + " ingresso(s)");
		sc.close();
		
	}

}
