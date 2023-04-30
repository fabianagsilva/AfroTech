/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

package exerciciosEstruturaDecisao;
 
import java.util.Scanner;

public class ex2_numeroCrescente {

	public static void main(String[] args)
	{
		int n1,n2,n3;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextInt();
		
		if (n1<=n2 && n2<=n3)
		{
			System.out.println("Os numeros digitados ordenados em ordem crecente são: " +n1 +" "+n2+" "+n3);//n1/n2/n3
		}
		else if (n2<=n1 && n1<=n3)
		{
			System.out.println("Os numeros em ordem crecente são: " +n2+" "+n1+" "+n3);//n2//n1/n3
		}
		else if (n3<=n2 && n2<=n1)
		{
			System.out.println("Os numeros em ordem crescente são: " +n3+" "+n2+" "+n1);//n3/n2/n1
		}
		else if (n3<=n1 && n1<=n2)
		{
			System.out.println("Os numeros em ordem crescente são: " +n3+" "+n1+" "+n2);//n3/n1/n2
		}
		else if (n1<=n3 && n3<=n1)
		{
			System.out.println("Os numeros em ordem crescente são: " +n1+" "+n3+" "+n2);//n1/n3/n2
		}
		else if (n2<=n3 && n3<=n1)
		{
			System.out.println("Os numeros em ordem crescente são: " +n2+" "+n3+" "+n1);//n2/n3/n1
		}

	}
	

}