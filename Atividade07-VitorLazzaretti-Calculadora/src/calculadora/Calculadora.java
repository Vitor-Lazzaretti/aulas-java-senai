package calculadora;

public class Calculadora {
	public double result = 0;
	
	public void mostrarMenu() {
		System.out.println("===============");
		System.out.println("[1] - Somar");
		System.out.println("[2] - Subtrair");
		System.out.println("[3] - Multiplicar");
		System.out.println("[4] - Dividir");
		System.out.println("[5] - Potenciar");
		System.out.println("[6] - Radiciar Quadradamente");
		System.out.println("[7] - Sair");
		System.out.println("===============");
	}
	
	public void mostrarAtual() {
		System.out.println("===============");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("===============");
		System.out.println("Valor atual: " + result);
	}
	
	public void somar(double num) {
		result += num;
		this.mostrarAtual();
	};
	
	public void subtrair(double num) {
		result -= num;
		this.mostrarAtual();
	};
	
	public void multiplicar(double num) {
		result *= num;
		this.mostrarAtual();
	};
	
	public void dividir(double num) {
		result /= num;
		this.mostrarAtual();
	};
	
	public void potenciar(double num) {
		result = Math.pow(result, num);
		this.mostrarAtual();
	};
	
	public void raizQuadrada() {
		result = Math.sqrt(result);
		this.mostrarAtual();
	};
}
