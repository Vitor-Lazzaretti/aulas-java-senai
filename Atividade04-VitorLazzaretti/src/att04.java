import java.util.Scanner;

public class att04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		double valorInicial, valorParcela, juros, desconto, valorFinal;
		
		System.out.print("Digite o valor do Pagamento: ");
		valorInicial = sc.nextDouble();
		
		System.out.println("Digite a opção de Pagamento: ");
		System.out.println("-----------");
		System.out.println("[1] Pagamento à vista - 15% de desconto sobre o valor total da compra;");
		System.out.println("[2] Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra;");
		System.out.println("[3] Pagamento parcelado em 6 vezes - não tem desconto;");
		System.out.println("[4] Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra;");
		System.out.println("-----------");
		System.out.print("Opção >>> ");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("Valor Inicial: " + valorInicial);
			desconto = valorInicial * 15 / 100;
			System.out.println("Desconto: " + desconto);
			valorFinal = valorInicial - desconto;
			System.out.println("Valor Final: " + valorFinal);
			break;
		case 2: 
			System.out.println("Valor Inicial: " + valorInicial);
			desconto = valorInicial * 10 / 100;
			System.out.println("Desconto: " + desconto);
			valorFinal = valorInicial - desconto;
			System.out.println("Valor Final: " + valorFinal);
			break;
		case 3: 
			System.out.println("Valor Inicial: " + valorInicial);
			valorParcela = valorInicial / 6;
			System.out.println("Parcelas: " + valorParcela);
			valorFinal = valorInicial;
			System.out.println("Valor Final: " + valorFinal);
			break;
		case 4: 
			System.out.println("Valor Inicial: " + valorInicial);
			juros = valorInicial * 8 / 100;
			valorParcela = (valorInicial + juros) / 12;
			System.out.println("Parcelas: " + valorParcela);
			System.out.println("Juros: " + juros);
			valorFinal = valorInicial + juros;
			System.out.println("Valor Final: " + valorFinal);
			break;
		default:
			System.out.println("Opção Inválida!");
			sc.close();
			return;
		}
		sc.close();
	}
}
