import java.util.Scanner;

public class Att_F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salFun, salMin = 1212;
		
		System.out.print("Digite seu sal�rio: ");
		salFun = sc.nextDouble();
		
		System.out.println("Voc� ganha " + salFun/salMin + " sal�rios m�nimos.");
		
		sc.close();
	}

}
