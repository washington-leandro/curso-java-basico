package com.washington.cursojava.aula10;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual é o seu nome? ");
		nome = teclado.nextLine();
		System.out.println("Qual é a sua idade? ");
		idade = teclado.nextInt();
		
		System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");
		
		teclado.close();
	}

}
