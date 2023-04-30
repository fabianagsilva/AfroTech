/*6- Faça um programa que pegue um número do teclado e calcule a soma de todos os	
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.*/

package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ex6_soma {
	

	 public static void main(String[] args) {
		   
	        Scanner ler = new Scanner(System.in);

	        int num, somaNum = 0, i=1;
	       
	                System.out.println("Digite um número: ");
	        num = ler.nextInt();
	               
	        if(num < 10){
	        do {
	        somaNum += num;
	            num --;
	            } while (num >= i);
	            System.out.println("\nA soma de todos os números de 1 até ele mesmo é: " + somaNum);
	        } else {
	            System.out.println("\nErro! \nDigite um número entre 1 a 9:");
	        }
	 }
}
