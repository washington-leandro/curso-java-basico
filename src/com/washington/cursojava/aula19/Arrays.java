package com.washington.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		//aula sobre vetores/arrays (estrutura de dados mais simples)
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 21.3;
		temperaturas[3] = 31.5;
		
		System.out.println("O valor da temperatura é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas); //output é o endereço na memoria
		
		for (int i=0; i < temperaturas.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturas[i]); //output dos 365 dias e a temperatura referente
		}
		
		/*for melhorado
		for (double temp : temperaturas) {
			System.out.println(temp);			
		}*/

	}

}
