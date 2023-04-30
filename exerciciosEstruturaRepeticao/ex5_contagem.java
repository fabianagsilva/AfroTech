/*5- Faça um programa que mostre uma contagem na tela de 233 a 456, só contando de 3
em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

package exerciciosEstruturaRepeticao;


public class ex5_contagem {

	public static void main(String[] args) {

		int num = 233, i = 3, y = 5;

		System.out.println("Apartir do número 233 \n");
		
		do {
			if (num >= 300 && num <= 400) {

				num = num + i;
			
				System.out.println("Somando + 3 o total é = " + num);

			} else {

				num = num + y;

				System.out.println("Somando + 5 o total é = " + num);
			}

		} while (num <= 456);
	}
}