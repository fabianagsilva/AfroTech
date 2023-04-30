/*1- A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

package exerciciosEstruturaRepeticao;

import java.util.*;

public class ex1_prefeitura {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int pop, filhos, totalFilhos = 0, i, y = 1;

		float sal, totalSal = 0, mediaSal, mediaFilhos, maiorSal = 0, percSal = 0;

		System.out.println("Qual a populacao da cidade..: \n");

		pop = ler.nextInt();

		for (i = 1; i <= pop; i++) {

			System.out.println("Qual o seu salario.........: R$ \n");

			sal = ler.nextFloat();

			System.out.println("Qual a quantidade de filhos...: \n");

			filhos = ler.nextInt();

			/* Soma dos salarios */

			totalSal = sal + totalSal;

			/* Soma dos filhos */

			totalFilhos = totalFilhos + filhos;

			/* Maior salario */

			if (maiorSal < sal) {

				maiorSal = sal;

			}

			/* Percentagem até R$ 100,00 */

			if (sal <= 100) {

				percSal = (y * 100) / pop;

				y++;

			}

		}

		/* Media dos salarios */

		mediaSal = totalSal / pop;

		/* Media dos filhos */

		mediaFilhos = totalFilhos / pop;

		System.out.println("\n---------------------------------------------------------------\n");

		System.out.println("\nA media do salario da populacao eh R$ " + mediaSal);

		System.out.println("\nA media do numero dos filhos eh " + mediaFilhos);

		System.out.println("\nO maior salario eh R$ " + maiorSal);

		System.out.println("\nA porcentagem das pessoas com salarios ate R$ 100,00 eh " + percSal);

	}
}
