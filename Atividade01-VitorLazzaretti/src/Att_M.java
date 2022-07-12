import java.util.Scanner;

public class Att_M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double quilowatt, salarioMinimo, qwGastos;
		System.out.println("Valor do salario minimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Quilowatts gastos: ");
		qwGastos = sc.nextDouble();
		quilowatt = salarioMinimo / 6;
		System.out.println("Valor de cada quilowatt: " + quilowatt);
		System.out.println("Valor pago pela residencia: " + qwGastos * quilowatt);
		System.out.println("Valor pago com desconto: " + qwGastos * quilowatt * 0.92);
		sc.close();
	}
}
