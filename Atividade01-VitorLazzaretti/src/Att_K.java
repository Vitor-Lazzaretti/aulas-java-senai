import java.util.Scanner;

public class Att_K {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, minutos;
		System.out.print("Digite as horas: ");
		horas = sc.nextInt();
		System.out.print("Digite os minutos: ");
		minutos = sc.nextInt();
		System.out.println("Horas em minutos: " + horas*60);
		System.out.println("Horas e minutos em minutos: " + (horas*60 + minutos));
		System.out.println("Minutos em segundos: " + minutos * 60);
		sc.close();
	}

}
