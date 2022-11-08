package com.washington.cursojava.imc;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Informe o seu peso (kg)");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Informe sua altura (m)");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.printf("Seu IMC é: %.2f", imc);

		teclado.close();
		
		}
}