/*6-	Fa�a um programa que l� um vetor de 3 elementos e 
 * uma matriz de 3 x 3 elementos. Em seguida o programa 
 * deve fazer a multiplica��o do vetor pelas colunas da matriz.*/

package Revis�o;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int [3] ;
		int [][] m = new int [3][3], mfinal = new int [3][3];
		int x, i, j;
		
		for(x=0; x<vetor.length; x++ )
		{
			System.out.printf("Informe os valores para o vetor na posi��o %d:",(x+1));
			vetor[x] = leia.nextInt();
		}
		
		System.out.println();
		
		for(i=0; i<m.length; i++)
		{
			for(j=0; j<m.length; j++)
			{
				System.out.printf("Informe os valores para a matriz:");
				m[i][j] = leia.nextInt();
			}
		}
		
		for(x=0; x<vetor.length; x++)
		{
			for(i=0; i<m.length; i++)
			{
				for(j=0; j<m.length; j++)
				{
					
					mfinal[i][j] = m[i][j]* vetor[x];
				}
			}
		}
		System.out.println("\nO resultado da multiplica��o �: ");
		System.out.println("\t   MATRIZ");
		
		for(i=0; i<m.length;i++)
		{System.out.printf("\t|");
			for(j=0; j<m.length; j++)
			{
				System.out.printf("%3d|", mfinal[i][j]);				
			}
			System.out.println();
		}
		
		
		
	}

}
