package desafiosdecontrole;

import java.util.Scanner;

public class ParImparWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero != 0) {
			System.out.println("Digite um numero: ");
			int num1 = scanner.nextInt();
			
			if(num1 %2 == 0){
				System.out.println("PAR: "+ num1);
			}else {
				System.out.println("IMPAR " + num1 );
			}
			
			System.out.println("Digite 0");
			numero = scanner.nextInt();
		}
	
		
		
		System.out.println("Programa encerrado!");
		
		scanner.close();
	}
}
