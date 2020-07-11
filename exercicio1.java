/*1-Elabore um programa que calcule o que deve ser pago por um produto, 
 * considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. 
 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento 
 * escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 

1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
*/

package Revis�o;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor, condpag;
		
		System.out.printf("Insira o valor do produto: R$");
		valor = leia.nextInt();
		System.out.printf("\n-Insira a forma de pagamento-\n"
				+ "\n1 - � vista em dinheiro ou cheque"
				+ "\n2 - � vista no cart�o de cr�dito"
				+ "\n3 - Em duas vezes"
				+ "\n4 - Em tr�s vezes"
				+ "\n\nA forma de pagamento escolhida foi:");
		condpag = leia.nextInt();
		
		switch(condpag)
		{
		case 1:
			valor = valor - ((valor * 20)/100);
			System.out.println("O valor a ser cobrado �: R$"+valor);
			break;
		case 2:
			valor = valor - ((valor * 15)/100);
			System.out.println("O valor a ser cobrado �: R$"+valor);
			break;
		case 3:
			valor = valor/2;
			System.out.println("O valor a ser cobrado s�o duas parcelas de: R$"+valor);
			break;
		case 4:
			valor = (valor + ((valor * 10)/100))/3;
			System.out.println("O valor a ser cobrado s�o tr�s parcelas de: R$"+valor);
			break;
		default:
			System.out.println("Insira uma op��o de pagamento v�lida!!!");
		}
	}

}
