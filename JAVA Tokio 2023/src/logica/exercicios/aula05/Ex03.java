package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Selecione o seu genêro");
		System.out.println("[M] - Masculino");
		System.out.println("[F] - Feminino");
		System.out.println("[O] - Outro");
		System.out.println("[N] - Nao Responder");
		
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Ola, " +nome + "Seu genero e: " +genero);
		
		
		
		
		

	}

}
