import java.util.Scanner;

public class att04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoCidade, veiculosPasseio, indAcidentes, maiorIndice = 0, menorIndice = 999999999, 
				codCidMaiInd = 0, codCidMenIn = 0, mediaVeiculos = 0, quant2000 = 0, med2000 = 0, i=1;
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		
		do {
			System.out.println("Código Cidade: ");
			codigoCidade = sc.nextInt();
			
			System.out.println("Número de veiculos de passeio: ");
			veiculosPasseio = sc.nextInt();
			
			
			System.out.println("Número de acidentes: ");
			indAcidentes = sc.nextInt();
			
			if(indAcidentes > maiorIndice) {
				maiorIndice = indAcidentes;
				codCidMaiInd = codigoCidade;
			}
			
			if(indAcidentes < menorIndice) { 
				menorIndice = indAcidentes;
				codCidMenIn = codigoCidade;
			}
			
			if(veiculosPasseio < 2000) {
				med2000 += indAcidentes;
				quant2000 += 1;
			}
			
			mediaVeiculos += veiculosPasseio;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
			i++;
		} while (i <= 5);
		
		System.out.println("Maior Indice: " + maiorIndice);
		System.out.println("Cidade do Maior Indice: " + codCidMaiInd);
		
		System.out.println("Menor Indice: " + menorIndice);
		System.out.println("Cidade do Menor Indice: " + codCidMenIn);
		
		mediaVeiculos = mediaVeiculos / 5;
		
		med2000 = med2000 / quant2000;

		System.out.println("Média veículos: " + mediaVeiculos);
		
		System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + med2000);
		sc.close();
	}

}
