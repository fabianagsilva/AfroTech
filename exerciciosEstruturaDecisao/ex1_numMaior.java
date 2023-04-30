/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ex1_numMaior {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int n1, n2, n3;
        
        System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
        if (n1 > n2) {
        	System.out.println("\nO maior número digitado foi: " + n1);
        	
        }
        		
        	else if(n2 > n3){
        		System.out.println("\nO maior número digitado foi: " + n2);
}
        	
        	else if(n3 > n1) {
        		
        		System.out.println("\nO maior número digitado foi: " + n3);
        		
        	}

	}

}