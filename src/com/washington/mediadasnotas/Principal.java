package com.washington.mediadasnotas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double nota01, nota02, nota03, nota04, soma, media;
		
		Scanner teclado = new Scanner(System.in);
		
		//Obtendo as notas do aluno
		System.out.println("Insira a primeira nota: ");
		nota01 = teclado.nextDouble();
		System.out.println("Insira a segunda nota: ");
		nota02 = teclado.nextDouble();
		System.out.println("Insira a terceira nota: ");
		nota03 = teclado.nextDouble();
		System.out.println("Insira a quarta nota: ");
		nota04 = teclado.nextDouble();
		
		soma = nota01 + nota02 + nota03 + nota04;
		media = (soma)/4;
		
		if (media >= 70) {
			System.out.println("Média: " +media+ ", você está, portanto, APROVADO!");
		} else if (media >= 30) {
			System.out.println("Média: " + media+ ", você está, portanto, EXAME FINAL!");
		} else {
			System.out.println("Média: " +media+ ", você está, portanto, REPROVADO!");
		}
		teclado.close();
	}

}
