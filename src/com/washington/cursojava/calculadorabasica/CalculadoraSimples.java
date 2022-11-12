package com.washington.cursojava.calculadorabasica;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String operacao = "";
		double numero01 = 0, numero02 = 0;
		
		System.out.println("Insira a opera��o para efetuar o c�lculo: ");
		operacao = scan.next();
		
		System.out.println("Insira o primeiro n�mero: ");
		numero01 = scan.nextDouble();
		System.out.println("Insirao segundo n�mero: ");
		numero02 = scan.nextDouble();
		
		switch (operacao) {
			case "+":
				System.out.println("Soma: " + (numero01+numero02));
				break;
			case "-":
				System.out.println("Subtra��o: " + (numero01-numero02));
				break;
			case "*":
				System.out.println("Multiplica��o: " + (numero01*numero02));
				break;
			case "/":
				System.out.println("Divis�o: " + (numero01/numero02));
				break;
			default:
				System.out.println("Opera��o inv�lida!");
				break;
		}
		scan.close();
	}

}
