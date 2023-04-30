/*2.Um dado é lançado 10 vezes e o valor correspondente é anotado.
 *Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 *A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
 *apresente também quantas foram as ocorrências da maior pontuação.*/

package exerciciosArrays;

import java.util.Scanner;

public class ex2_dado {

	public static void main(String[] args) {
		
		        int dadoLancado = 3;
		        int maiorNumero = 0;
		        double somaLancado = 0;
		        double media = 0;
		        int[] dado = new int[dadoLancado];

		        for (int i = 0; i < dadoLancado; ++i) {
		            Scanner input = new Scanner(System.in);

		            System.out.println("Qual o valor do dado: ");
		            dado[i] = input.nextInt();

		            somaLancado += dado[i];

		            if (maiorNumero < dado[i]) {
		                maiorNumero = dado[i];

		            }
		        }

		        media = somaLancado / dado.length;

		        System.out.println("\nA média dos valores informados é de: " + media);
		        System.out.println("\nA maior pontuações foi: " +maiorNumero);
		    }

		}

