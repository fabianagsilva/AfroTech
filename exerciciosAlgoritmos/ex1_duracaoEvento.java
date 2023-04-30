/* 1. Faça um sistema que leia o tempo de duração de um evento em uma fábrica,
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package exerciciosAlgoritmos;


import java.io.IOException;
import java.util.Scanner;


public class ex1_duracaoEvento {

	public static void main(String[]agr)throws IOException {

		@SuppressWarnings("resource")	
		Scanner input = new Scanner (System.in);
		int n, h, m, s;

		System.out.println("Digite o tempo de duração do evento");
		n = input.nextInt();

		h = (n /3600);
		m = (n % 3600)/ 60;
		s = (n % 3600)% 60;
		
		System.out.println("A duração do Evento será: \nh, " + h +"\nm, " + m + "\ns :" + s);
		
	}
				

}
