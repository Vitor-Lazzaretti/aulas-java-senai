import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Informe o valor de A:");
		a = sc.nextDouble();
		System.out.println("Informe o valor de B:");
		b = sc.nextDouble();
		System.out.println("Informe o valor de C:");
		c = sc.nextDouble();
		
		if(a == 0) {
			System.out.println("A não pode ser igual a 0!");
		} else {
			delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A sua equação não possui raízes reais!");
			} else if (delta == 0){
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				System.out.println("A sua equação tem uma só raiz, sendo ela " + x1);
			} else {
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("A sua primeira raíz é " + x1 + " e a segunda raíz é " + x2);
			}
		}
		
		sc.close();
	}

}
