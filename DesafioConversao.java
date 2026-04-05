package desafios;

import java.util.Scanner;



public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		
		System.out.print("Digite Salario 1: ");
		salario1 = scanner.nextLine().replace(",", ".");
		
		System.out.print("Digite Salario2: ");
		salario2 = scanner.nextLine().replace(",", ".");;
		
		System.out.print("Digite Salario3: ");
		salario3 = scanner.nextLine().replace(",", ".");;
		
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double soma = (numero1 + numero2 + numero3);
		
		double media = soma /3;
		
	
		
		System.out.println("Soma: " + soma);
		
		System.out.println("Media: " + media);
		
		
		
		
		scanner.close();
		
		
	}

}
