package desafiosdecontrole;

import java.util.Scanner;

public class DesafioMediaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double quantidadeDeNota = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota (PARA SAIR digite -1)");
			nota = scanner.nextDouble();
			
			if(nota <=10 && nota >=0 ) {
				total += nota;
				quantidadeDeNota++;
			}else if(nota != -1) {
				System.out.println("Nota invalida!!");
			}
		}
		
		double media = total / quantidadeDeNota;
		System.out.println("Média do aluno é: " + media);
		System.out.println("Fim do programa!! ");
		
		scanner.close();
	}
}
