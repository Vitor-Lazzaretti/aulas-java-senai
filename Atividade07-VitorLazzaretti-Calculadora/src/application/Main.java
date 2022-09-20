package application;

import java.util.Scanner;

import calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		int continuar = 0;
		
		System.out.println("Começo: " + calc.result);
		
		while (continuar != 7) {
			calc.mostrarMenu();
			System.out.print("Qual operação quer realizar? ");
			continuar = sc.nextInt();
			
			if(continuar < 1 && continuar > 7) {
				System.out.println("Essa opção não existe!");
			} else if (continuar != 6 && continuar != 7) {
				System.out.print("Digite o número: ");
			}
						
			if (continuar == 1) {
				calc.somar(sc.nextDouble());
			}
			
			if (continuar == 2) {
				calc.subtrair(sc.nextDouble());
			}
			
			if (continuar == 3) {
				calc.multiplicar(sc.nextDouble());
			}
			
			if (continuar == 4) {
				calc.dividir(sc.nextDouble());
			}
			
			if (continuar == 5) {
				calc.potenciar(sc.nextDouble());
			}
			
			if (continuar == 6) {
				calc.raizQuadrada();
			}
			
		}
		System.out.println("===============");
		System.out.println("O resultado final foi: " + calc.result);
		System.out.println("===============");
		
		sc.close();
	}

}
