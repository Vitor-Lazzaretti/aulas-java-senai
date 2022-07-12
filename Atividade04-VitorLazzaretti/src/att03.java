import java.util.Scanner;

public class att03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeLivros, opcao;
		double crit1, crit2;
		
		System.out.println("Quantos Livros quer comprar? ");
		quantidadeLivros = sc.nextInt();
		
		crit1 = 0.25 * quantidadeLivros + 7.5;
		crit2 = 0.5 * quantidadeLivros + 2.5;
		
		if(crit1 < crit2) {
			opcao = 1;
		} else {
			opcao = 2;
		}
		
		switch (opcao) {
		case 1: 
			System.out.println("Escolha R$0,25 por livro + R$7,50 fixo! É mais barato...");
			break;
		case 2: 
			System.out.println("Escolha R$0,50 por livro + R$2,50 fixo! É mais barato...");
			break;
		default:
			System.out.println("Erro!");
			sc.close();
			return;
		}
		
		sc.close();
	}

}
