/*4. Construa um programa em que, tendo como dados de entrada dois pontos 
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
que efetua tal cálculo é*/

package exerciciosAlgoritmos;

import java.util.Scanner;
import java.lang.Math;


public class ex4_distancia {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 Double x1, x2, y1, y2, d, p1, p2;
		
		System.out.println("Digite o valor de x1:");
		x1=leia.nextDouble();
		
		System.out.println("Digite o valor de x2:");
		x2=leia.nextDouble();
		
		System.out.println("Digite o valor de y1:");
		y1=leia.nextDouble();
		
		System.out.println("Digite o valor de y2:");
		y2=leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2- x1),2)+Math.pow((y2-y1),2)));
		
		System.out.println("\nA Distancia é :" + d);


	}

}
