package arrays;

import java.util.Scanner;

public class MediasComArrays {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Quantas notas");
	int qntNotas = scanner.nextInt();
	
	
	double[] notas =  new double[qntNotas];
	
	for(int i = 0; i < notas.length; i++) {
		System.out.println("Digite sus notas" + i +": ");
		notas[i] = scanner.nextDouble();
	}
	
	double total = 0;
	
	
	for(double nota: notas) {
		total += nota;
	}
	
	double media = total /notas.length;
	System.out.println(media);
	
	
	
	scanner.close();
	
	}
	
}

