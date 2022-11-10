package com.washington.cursojava.categorialutador;

import java.util.Scanner;

public class Pessoa {
	
	Scanner teclado = new Scanner(System.in);
	
	String nome, categoria;
	double massa;
	
	public void info() {
		
	System.out.println("Insira o seu nome: ");
	nome = teclado.nextLine();
	System.out.println("Informe a sua massa: ");
	massa = teclado.nextDouble();
	
	
	while (massa < 121) {
		// condi�ional para vefiricar a categoria do atleta
		if (massa < 57) {
			categoria = "Peso Mosca";
		} else if (massa < 62) {
			categoria = "Peso Galo";
		} else if (massa < 67) {
			categoria = "Peso Pena";
		} else if (massa < 71) {
			categoria = "Peso Leve";
		} else if (massa < 78) {
			categoria = "Peso Meio-M�dio";
		} else if (massa < 85) {
			categoria = "Peso M�dio";
		} else if (massa < 94) {
			categoria = "Peso Meio-Pesado";
		} else {
			categoria = "Peso Pesado";
		}
		System.out.println("Seja bem-vindo, "+nome+ ", voc� pertence � categoria: "+categoria+ "!");
		break;
	}
	//System.out.println("Seja bem-vindo, "+nome+ ", voc� pertence � categoria: "+categoria+ "!");
	if (massa >= 121) {
		System.out.println("ATEN��O!!! \nLimite de massa excedida!");
	}
	
	teclado.close();
	
	}
}
