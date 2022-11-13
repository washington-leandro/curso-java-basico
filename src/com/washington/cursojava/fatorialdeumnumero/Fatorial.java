package com.washington.cursojava.fatorialdeumnumero;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero, fatorial=1, i=1;
		
		System.out.println("Informe o numero para calcular o fatorial: ");
		numero = scan.nextInt();
		
		while (i <= numero) {
			fatorial = fatorial * i;
			i++;
		}
		System.out.println("O fatorial do numero " + numero + " é: " + fatorial);		
		
		/*
		for(int i=1; i <= numero; i++) {
			fatorial = fatorial * i;
		
		}
		System.out.println("O fatorial do numero " + numero + " é: " + fatorial);*/
		scan.close();
	}	
}