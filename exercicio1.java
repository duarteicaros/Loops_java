/*1-Elabore um programa que calcule o que deve ser pago por um produto, 
 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
 * escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 

1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/

package Revisão;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor, condpag;
		
		System.out.printf("Insira o valor do produto: R$");
		valor = leia.nextInt();
		System.out.printf("\n-Insira a forma de pagamento-\n"
				+ "\n1 - À vista em dinheiro ou cheque"
				+ "\n2 - À vista no cartão de crédito"
				+ "\n3 - Em duas vezes"
				+ "\n4 - Em três vezes"
				+ "\n\nA forma de pagamento escolhida foi:");
		condpag = leia.nextInt();
		
		switch(condpag)
		{
		case 1:
			valor = valor - ((valor * 20)/100);
			System.out.println("O valor a ser cobrado é: R$"+valor);
			break;
		case 2:
			valor = valor - ((valor * 15)/100);
			System.out.println("O valor a ser cobrado é: R$"+valor);
			break;
		case 3:
			valor = valor/2;
			System.out.println("O valor a ser cobrado são duas parcelas de: R$"+valor);
			break;
		case 4:
			valor = (valor + ((valor * 10)/100))/3;
			System.out.println("O valor a ser cobrado são três parcelas de: R$"+valor);
			break;
		default:
			System.out.println("Insira uma opção de pagamento válida!!!");
		}
	}

}
