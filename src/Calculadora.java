import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor1;
		float valor2;
		float soma, sub, mult;
		
		//entrada
		System.out.println("Favor digitar o primeiro valor");
		Scanner leitor = new Scanner(System.in);
		valor1 = leitor.nextFloat();
		System.out.println("Favor digitar o segundo valor");
		valor2 = leitor.nextFloat();
		
		//operações
		soma = valor1 + valor2;
		sub = valor1 - valor2;
		mult = valor1 * valor2;
		
		//saídas
		System.out.println("A soma e: " + soma);
		System.out.println("A subtracao e: " + sub);
		System.out.println("A multiplicacao e: " + mult);
		
		leitor.close();
	
		
	}

}
