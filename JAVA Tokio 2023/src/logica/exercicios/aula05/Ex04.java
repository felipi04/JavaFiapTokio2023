package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da nota A");
		double A = entrada.nextDouble();
		System.out.println("Digite o valor da nota B");
		double B = entrada.nextDouble();
		
		double notaFinal = (A+B) / 2;
		
		System.out.println("Sua nota é:  " + notaFinal);
	
		
		

	}

}
