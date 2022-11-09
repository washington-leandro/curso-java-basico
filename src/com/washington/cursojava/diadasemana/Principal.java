package com.washington.cursojava.diadasemana;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira um n�mero de [1-7] para saber qual o dia da semana esse n�mero corresponde.");
		System.out.print(">>> ");
		numero = teclado.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("O n�mero digitado � inv�lido.");
			break;
		}
		teclado.close();
	}

}