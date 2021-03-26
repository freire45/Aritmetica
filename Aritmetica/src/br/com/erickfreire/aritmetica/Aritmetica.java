package br.com.erickfreire.aritmetica;

import java.util.Scanner;

/**
 * Programa em Java que calcula as quatro operações básicas
 * @author Erick Freire
 * @version 1 - Criado em 25-03-2021 as 23:47
 */

public class Aritmetica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("Soma: %d%n", (numero1 + numero2));
		System.out.printf("Subtração: %d%n", (numero1 - numero2));
		System.out.printf("Produto: %d%n", (numero1 * numero2));
		System.out.printf("Quociente: %d%n", (numero1 / numero2));
		
	}

}
