package exercicios_java;

import java.util.Scanner;


public class MediaAritmetica {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota1 = 8, nota2 = 9, nota3 = 7;
		double nota4 = 4, nota5 = 5, nota6 = 6;
		double media;
		double media1;
		
		double resultado; 

			System.out.println("Agora digite as notas do Primeiro semestre");
		 	scanner.nextLine();
		 
		    System.out.print("Digite sua nota:");
		    nota1 = scanner.nextDouble();
		    System.out.print("Digite sua nota:");
		 	nota2 = scanner.nextDouble();
		 	System.out.print("Digite sua nota:");
		 	nota3 = scanner.nextDouble();
		 	
		 	System.out.println("Agora digite as notas do segundo semestre");
		 	scanner.nextLine();
		 
		 	System.out.print("Digite sua nota:");
		 	nota4 = scanner.nextDouble();
		 	System.out.print("Digite sua nota:");
		 	nota5 = scanner.nextDouble();
		 	System.out.print("Digite sua nota:");
		 	nota6 = scanner.nextDouble();
		 

		media = (nota1 + nota2 + nota3 )/3;
		
		media1 = (nota4 + nota5 + nota6)/3;
		
		resultado = (media + media1)/2;
		
		System.out.println("Sua media Total foi: " + resultado);
		
		scanner.close();
		
		
		
	}
}

