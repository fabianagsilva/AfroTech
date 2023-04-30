/*4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.*/

package exerciciosArrays;

import java.util.Scanner;

public class ex4_matriz3x3 {

	public static void main(String[] args) {

		int matriz[][] = new int[3][3];
		int somaMatriz = 0, somaDiagonal = 0, linha, coluna;

		for (linha = 0; linha < 3; ++linha) {
			for (coluna = 0; coluna < 3; ++coluna) {

				Scanner input = new Scanner(System.in);

				System.out.println("Digite o valor da matriz: ");
				matriz[linha][coluna] = input.nextInt();

				somaMatriz += matriz[linha][coluna];

				if (linha == coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nA soma dos valores das matrizes é de: " + somaMatriz);
		System.out.println("\nA soma da Diagonal é de: " + somaDiagonal);
	}
}