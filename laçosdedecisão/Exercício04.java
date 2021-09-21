package laçosdedecisão;

import java.util.Scanner;

public class Exercício04 {

	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/ 
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par...");
			raiz = Math.sqrt(num);
			System.out.println("Raiz Quadrada: " + raiz);
		}
		else if(num % 2 == 1) {
			System.out.println("Ímpar...");
			elevado = Math.pow(num, 2);
			System.out.println("Elevado: " + elevado);
			
			ler.close();
		}
	}

}
