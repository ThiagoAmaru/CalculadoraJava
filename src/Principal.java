import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite: ");
		System.out.println("1. Somar ");
		System.out.println("2. Subtrair: ");
		System.out.println("3. Multiplicar ");
		System.out.println("4. Dividir ");
		
		int opcao = teclado.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		double n1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double n2 = teclado.nextDouble();
		
		switch (opcao) {
		
		case 1: {
			Adicao exc = new Adicao();
			exc.adi(n1, n2);
			break;
		}
		case 2: {
			Subitracao exc = new Subitracao();
			exc.sub(n1, n2);
			break;
		}
		
		case 3: {
			Multiplicacao exc = new Multiplicacao();
			exc.mult(n1, n2);
			break;
		}
		
		case 4: {
			Divisao exc = new Divisao();
			exc.div(n1, n2);
			break;
			
		}
		}
		
		
		teclado.close();
		
	}

}
/*Documentar
 * Tratar excecoes
 * adicionar mais funcionalidades
 * Consertar problemas do maven
 */