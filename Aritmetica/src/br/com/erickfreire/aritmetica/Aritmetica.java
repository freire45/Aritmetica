package br.com.erickfreire.aritmetica;

import java.util.Scanner;

/**
 * Crie um programa que recebe dois valores digitados pelo usuário e exibe a soma, produto, diferença e quociente
 * @version 1 - Criado em 05-01-2020 as 20:14
 * @author Erick Freire
 *
 */

public class Aritmetica {
	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Programa que calcula as operações básicas: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Sgite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("%nSoma: %d%n", numero1 + numero2);
		System.out.printf("Produto: %d%n", numero1 * numero2);
		System.out.printf("Subtração: %d%n", numero1 - numero2);
		System.out.printf("Quociente: %d%n", numero1 / numero2);
		
	}

}
