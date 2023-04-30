/*3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
no final o total do somatório, a média e o total de valores lidos. O programa deve fazer as
leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o
programa deve parar quando o usuário fornecer um valor negativo.*/

package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ex3_somaSucessiva {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		{

			int cont = 0, num = 0, soma = 0;

			while (true) {
				System.out.println("Digite um numero: ");
				num = input.nextInt();

				if (num >= 0) {
					soma = soma + num;
					cont++;
				} else {
					break;
				}
			}
			System.out.println("A soma é: " + soma);
			System.out.println("A media é: " + soma / cont);
			System.out.println("A quantidade de numeros digitados é: " + cont);

		}
	}
}
