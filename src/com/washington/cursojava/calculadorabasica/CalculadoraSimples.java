package com.washington.cursojava.calculadorabasica;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String operacao = "";
		double numero01 = 0, numero02 = 0;
		
		System.out.println("Insira a operação para efetuar o cálculo: ");
		operacao = scan.next();
		
		System.out.println("Insira o primeiro número: ");
		numero01 = scan.nextDouble();
		System.out.println("Insirao segundo número: ");
		numero02 = scan.nextDouble();
		
		switch (operacao) {
			case "+":
				System.out.println("Soma: " + (numero01+numero02));
				break;
			case "-":
				System.out.println("Subtração: " + (numero01-numero02));
				break;
			case "*":
				System.out.println("Multiplicação: " + (numero01*numero02));
				break;
			case "/":
				System.out.println("Divisão: " + (numero01/numero02));
				break;
			default:
				System.out.println("Operação inválida!");
				break;
		}
		scan.close();
	}

}
