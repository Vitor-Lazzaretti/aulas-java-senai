import java.util.Scanner;

public class att02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pesoProdutoKG, valorPesoProduto, valorImposto, valorTotal;
		int codigoProduto, codigoPais, impostoProduto;
		
		System.out.println("Digite o código do produto: ");
		codigoProduto = sc.nextInt();
		
		System.out.println("Digite o peso em KG do produto: ");
		pesoProdutoKG = sc.nextDouble();
		
		System.out.println("Digite o código do país: ");
		codigoPais = sc.nextInt();
		
		switch (codigoPais) {
		case 1: 
			impostoProduto = 0;
			break;
		case 2: 
			impostoProduto = 15;
			break;
		case 3: 
			impostoProduto = 25;
			break;
		default:
			System.out.println("Valor inválido!");
			sc.close();
			return;
		}
		
		if (codigoProduto <= 4 && codigoProduto >= 1) {
			valorPesoProduto = 1000 * pesoProdutoKG * 10;
		} else if (codigoProduto <= 7 && codigoProduto > 1){
			valorPesoProduto = 1000 * pesoProdutoKG * 25;
		} else if (codigoProduto <= 10 && codigoProduto > 1) {
			valorPesoProduto = 1000 * pesoProdutoKG * 35;
		} else {
			System.out.println("Valor inválido!");
			sc.close();
			return;
		}
		
		valorImposto = (valorPesoProduto * impostoProduto / 100);
		valorTotal = valorPesoProduto + valorImposto;
		
		System.out.println("Peso do Produto em gramas: " + pesoProdutoKG * 1000);
		System.out.println("Preço do produto: " + valorPesoProduto);
		System.out.println("Valor do Imposto: "+ valorImposto);
		System.out.println("Valor Total: " + valorTotal);
		
		sc.close();
	}

}
