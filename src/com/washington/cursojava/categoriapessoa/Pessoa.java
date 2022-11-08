package com.washington.cursojava.categoriapessoa;

import java.util.Scanner;

public class Pessoa {
		
	String nome, categoria;
	int idade;
	
	public void info() {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a sua idade: ");
		idade = teclado.nextInt();
		
		// VERIFICAÇÃO DE CATEGORIA
		if (idade < 10) {
		categoria = "MIRIM";
		} else if (idade < 15) {
		categoria = "INFANTIL";
		} else if (idade < 20) {
		categoria ="JUNIOR";
		} else if (idade < 26) {
		categoria ="SÊNIOR";
		} else {categoria = "MASTER";}
		
		System.out.println("Olá, "+nome+"!"+" Você tem "+idade+ " anos."+" Classificação: "+ categoria);
		
		teclado.close();

	}

}
