/*3-Escrever um programa que leia uma quantidade desconhecida de números 
 * e conte quantos deles estão nos seguintes intervalos:
 *  [0-25], [26-50], [51-75] e [76-100]. 
 *  A entrada de dados deve terminar quando for lido um número negativo.*/

package Revisão;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int x=0, cont1=0, cont2=0, cont3=0, cont4=0;
		
		System.out.printf("Insira algum número: ");
		x = leia.nextInt();
		
		while(x>=0)
		{				
			if(x>=0 && x<=25)
			{
				cont1++;
			}
			if(x>=26 && x<=50)
			{
				cont2++;
			}
			if(x>=51 && x<=75)
			{
				cont3++;
			}
			if(x>=76 && x<=100)
			{
				cont4++;
			}
			System.out.printf("Insira algum número: ");
			x = leia.nextInt();
		}
		
		
		
		
		System.out.println("\n1Entre o intervalo de 0 a 25, temos: "+cont1+" numeros.");
		System.out.println("Entre o intervalo de 26 a 50, temos: "+cont2+" numeros.");
		System.out.println("Entre o intervalo de 51 a 75, temos: "+cont3+" numeros.");
		System.out.println("Entre o intervalo de 76 a 100, temos: "+cont4+" numeros.");
		

	}

}
