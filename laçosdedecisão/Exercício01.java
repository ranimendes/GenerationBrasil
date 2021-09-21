package laçosdedecisão;

import java.util.Scanner;

public class Exercício01 {
	
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

	public static void main(String[] args) {
		
		int n1, n2, n3, maiorN = 0;
		
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Escreva o primeiro número: ");
	n1 = leia.nextInt();
	
	System.out.println("Escreva o segundo número: ");
	n2 = leia.nextInt();
	
	System.out.println("Escreva o terceiro número: ");
	n3 = leia.nextInt();
	
		if (n1 > maiorN) {
			maiorN = n1;
		}
		if (n2 > maiorN) {
			maiorN = n2;
		}
		if (n3 > maiorN) {
			maiorN = n3;
		}		leia.close();
				
			System.out.println("Maior Número: " + maiorN);
	}
	
}
