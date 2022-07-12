import java.util.Scanner;

public class Att_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano[] = new int[2], mes[] = new int[2], dia[] = new int[2];
		
		for(int i = 0; i<2;i++) {
			System.out.printf("\nDigite o dia [%d]:", i+1);
			dia[i] = sc.nextInt();
			System.out.printf("\nDigite o mes [%d]:", i+1);
			mes[i] = sc.nextInt();
			System.out.printf("\nDigite o ano [%d]:", i+1);
			ano[i] = sc.nextInt();
		}
		
		if(ano[0] > ano[1]) {
			System.out.println("A primeira data é maior");
		} else if (ano[0] == ano[1]) {
			if(mes[0] > mes[1]) {
				System.out.println("A primeira data é maior");
			} else if (mes[0] == mes[1]) {
				if(dia[0] > dia[1]) {
					System.out.println("A primeira data é maior");
				} else if(dia[0] == dia[1]) {
					System.out.println("A data é a mesma");
				} else {
					System.out.println("A segunda data é maior");
				}
			} else {
				System.out.println("A segunda data é maior");
			}
		} else {
			System.out.println("A segunda data é maior");
		}
		
		
		sc.close();
	}

}
