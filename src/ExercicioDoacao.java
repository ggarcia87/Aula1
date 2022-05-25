import java.util.Scanner;	
public class ExercicioDoacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor1;
		float valor2;
		float mult;
		
		System.out.println("Favor inserir valor da doacao:");
		Scanner leitor = new Scanner(System.in);
		valor1 = leitor.nextFloat();
		System.out.println("Cotacao dolar hoje:");
		valor2 = leitor.nextFloat();
		
		mult = valor1 * valor2;
		
		System.out.println("A doacao foi de R$:" + mult);
		
		leitor.close();
				
		
	}

}
