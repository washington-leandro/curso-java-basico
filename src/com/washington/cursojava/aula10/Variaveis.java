package com.washington.cursojava.aula10;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual � o seu nome? ");
		nome = teclado.nextLine();
		System.out.println("Qual � a sua idade? ");
		idade = teclado.nextInt();
		
		System.out.println("Ol�, " + nome + ". Voc� tem " + idade + " anos.");
		
		teclado.close();
	}

}
