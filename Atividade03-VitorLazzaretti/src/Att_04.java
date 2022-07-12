import java.util.Scanner;

public class Att_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inHr, inMn, fimHr, fimMn;
		System.out.println("Hora inicial: ");
		inHr = sc.nextInt();
		System.out.println("Hora inicial: ");
		inMn = sc.nextInt();
		System.out.println("Hora inicial: ");
		fimHr =sc.nextInt();
		System.out.println("Hora inicial: ");
		fimMn = sc.nextInt();
		
		if(fimMn > inMn) {
			fimHr = fimHr + 1;
			inMn = inMn + 60;
		}
		
		System.out.println("Duração: " + (inHr - fimHr) + ":" + (fimHr - fimMn));
		sc.close();
	}
}
