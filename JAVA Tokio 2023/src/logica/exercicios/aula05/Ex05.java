package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o valor da nota A: ");
	double A = entrada.nextDouble();
	System.out.println("Digite o valor da nota B: ");
	double B = entrada.nextDouble();
	
	System.out.println("Sua nota final é: " +(A + B)/2);
	
	entrada.close();
	
	
	
	}

}
