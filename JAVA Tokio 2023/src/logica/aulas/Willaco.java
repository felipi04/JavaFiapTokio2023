package logica.aulas;

import java.util.Scanner;

public class Willaco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		int i = 0;
//		
//		while (i < 10) {
//			System.out.println(".");
//			i++;
//		}
		
//		String jogar = "sim";
//		
//		while(jogar == "sim") {
//			System.out.println("Repete ou inicia o Jogo");
//			
//			System.out.println("Deseja jogar novamente?");
//			jogar = entrada.nextLine();
//			
//		}
//		
//		System.out.println("oiii");
//		

		//MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while(i < 10) {
			i++;
			
			if (i ==3) {
				continue;
			}
			
			System.out.println("Cambalhota" + i);
			
		System.out.println("Fim do programa");
		
			}
			
		}
	}


