package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String valor1 = JOptionPane.showInputDialog("Digite um NUMERO: ");
		String valor2 = JOptionPane.showInputDialog("Digite segundo NUMERO: ");
		String escolha = JOptionPane.showInputDialog("Escolha: ('+', '-', '*', '/', '%')");
		
		
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);
		char op = escolha.charAt(0);
		
		int resultado= 
				(op == '+')? num1 + num2:
				(op == '-')? num1 - num2:
				(op == '*')? num1 * num2:
				(op == '/')? num1 / num2:0;
		
		
		JOptionPane.showInputDialog("Resultado do calculo: " + resultado);
												
		
		
		
		scanner.close();
	}

}
