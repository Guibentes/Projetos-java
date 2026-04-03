package exercicios_java;

public class Temperatura {

	public static void main(String[] args) {
		
		int valor1 = 100;
		final double FAHRENHEIT = 32;
		final double DIVISAO = 5/9.0;
			
		double C = (valor1 - FAHRENHEIT) *DIVISAO; 
			
		System.out.println("Tempreratura: "+C);
		
	}
}
