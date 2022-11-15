package com.washington.cursojava.manipularplanilha;

public class Planilha {

	public static void main(String[] args) {
		//OBSERVAÇÃO
		/*Treinando manipulação de planilha
		 * porem ainda há muito no que melhorar*/
		int[][] planilha =
		{
			{1, 2, 3, 4, 5, 0},
			{5, 6, 7, 8, 9, 0},
			{1, 2, 3, 4, 5, 0},
			{5, 6, 7, 8, 9, 0},
			{1, 2, 3, 4, 5, 0}
		
		};
		int somaTotal = 0;
		for ( int i=0; i < planilha.length; i++) {
			for (int j=0; j < planilha.length; j++) {
				planilha[i][5] += planilha[i][j];
			}
			somaTotal += planilha[i][5];
			System.out.println(somaTotal);
		} 
		System.out.println(somaTotal);
	}

}