package com.washington.cursojava.leonidas;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu palpite:");
		
		int palpite = teclado.nextInt();
		String msg;
		while(palpite != 10000) {
			
			msg = palpite < 10000?"Um pouco mais...":"Um pouco menos...";
			System.out.println(msg);
			
			System.out.println("Informe seu proximo palpite:");
			palpite = teclado.nextInt();			
		}
		
		System.out.println("Está correto!");
		teclado.close();
	}
}
