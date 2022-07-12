import java.util.Scanner;

public class Att_J {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money;
		System.out.print("Quanto dinheiro você tem? ");
		money = sc.nextDouble();
		System.out.println("Seu dinheiro em dólar australiano: " + money / 3.55);
		System.out.println("Seu dinheiro em btc: " + money / 194000);
		System.out.println("Seu dinheiro em libras esterlinas: " + money / 6.29);
		sc.close();
	}

}
