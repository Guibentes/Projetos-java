package exercicios_java;

import java.util.Scanner;


public class MediaAritmetica {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		double media;
		
		System.out.println("Digite sua nota:");
		nota1 = scanner.nextDouble();
		System.out.println("Digite sua nota:");
		nota2 = scanner.nextDouble();
		System.out.println("Digite sua nota:");
		nota3 = scanner.nextDouble();
		System.out.println("Digite sua nota:");
		nota4 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4; 
		
		System.out.println("Sua media foi: " + media);
		
		scanner.close();
	}
}
